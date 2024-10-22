import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Kolhapur",50);
        map.put("Maharatra",20);
        map.put("Radhanagari",100);
        System.out.println(map);

        map.put("Kolhapur",30);
        System.out.println(map);

         //Search
         if(map.containsKey("Radhanagari")){
           System.out.println("Key is present in the map");
         }else{
            System.out.println("Not Contain");
         }
         //To get value
         System.out.println(map.get("Radhanagari"));//Exist key
         System.out.println(map.get("Bondrenagar"));//Not Exist key

         //for loop
         int arr[]={12,15,18};
         for(int val : arr){
            System.out.print(val+" ");

         } 
         System.out.println();

         for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
         }

         //Key set
         Set<String> keys=map.keySet();
         for(String key: keys){
            System.out.println(key+ " "+map.get(key));
         }
         
         //Remove
         map.remove("Maharatra");
            System.out.println(map);
         

    }
    
}
