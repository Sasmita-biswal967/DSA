import java.util.*;

class Main {
    public static List<String>Itinerary(HashMap<String,String>tickets){
        HashMap<String,String> revMap=new HashMap<>();
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        
        String start="";
        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                start=key;
                break; 
            }
        }
        
        List<String> ans=new ArrayList<>();
        while(tickets.containsKey(start)){
            ans.add(start);
            start=tickets.get(start);
        }
        ans.add(start);
        return ans;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        List<String> ans=Itinerary(tickets);
        System.out.println("Intineray: "+ String.join("->",ans));
        
    }
}
