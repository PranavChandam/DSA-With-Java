import java.util.*;

public class Qframe {
    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
       // Queue<Integer> Q= new ArrayDeque<>();      // Second Method
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);

        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }
    }
    
}
