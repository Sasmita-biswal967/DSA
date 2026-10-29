import java.util.*;

class Main {
    public static List<Integer> intersectionArray(int arr1[], int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            if(set.contains(num)){
                ans.add(num);
                set.remove(num);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        List<Integer> result = intersectionArray(arr1, arr2);

        System.out.println("Intersection of two arrays:");
        System.out.println(result);
        
    }
}
