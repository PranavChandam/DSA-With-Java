
///////////////////   QUEUE USING ARRAY ///////////////////////////////
public class Qarray {
    static class Q{
        static int arr[];
      static  int size;
         static int rear=-1;

        public Q(int n){
            arr= new int[n];
            this.size=n;  
        }

      public static boolean isEmpty(){
        return rear==-1;
      }

      //Enque
      public static void add(int data){
        if(rear==size-1){
           System.out.println("Queue is Fulled");
           return;
        }
        rear++;
        arr[rear]=data;
      }

      //Deque
      public static int remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
      }

      //Peek
      public static int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
       return arr[0];
      }
    }
   public static void main(String[] args) {
    Q s=new Q(5);
    s.add(1);
    s.add(2);
    s.add(3);

    while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.remove();
    }
   }
}
