import java.util.*;
public class LLFramework {
   
   
    
    public static void main(String args[]){
        LinkedList <String> list= new LinkedList<String>();
        list.addFirst("A");
        list.addFirst("is");
       list.addFirst("this");
       System.out.println(list);

       list.addLast("Linkedlist");
       System.out.println(list);

       list.removeFirst();
       System.out.println(list);

       list.removeLast();
       System.out.println(list);

       list.remove(1);
       System.out.println(list);
       

    }
}
