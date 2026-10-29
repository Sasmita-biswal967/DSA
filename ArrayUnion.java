import java.util.*;

class ArrayUnion {
    public static int[] unionArray(int arr1[], int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        int[] ans =new int[set.size()];

        int i=0;
        for(int num:set){
            ans[i++]=num;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        int[] result = unionArray(arr1, arr2);

        System.out.println("Union of two arrays:");
        System.out.println(Arrays.toString(result));
        
    }
}
