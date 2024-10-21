import java.util.HashSet;
//import java.util.*;
import java.util.Iterator;
public class Hashset1 {
   
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
     //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);
        System.out.println(set);

        //Search --By using Contains
        if(set.contains(1)){
            System.out.println("set contain 1");
        }
        if(!set.contains(6)){
            System.out.println(" 6 Doesnot contain");
        }
         //To check Size --
         System.out.println("Size is:"+set.size());

        //Delete
        set.remove(1);
        System.out.println(set);
        if(!set.contains(1)){
            System.out.println("Not Contain");
        }

       
        
        //Iterator    
      Iterator it=set.iterator();


      //1]it.hasNext()   2]it.Next()
       while (it.hasNext()) {
        System.out.println(it.next());
       }
    }
}
