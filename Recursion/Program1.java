
//Program to print 5 to 1

// public class Program1 {
//     public static void print(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         print(n-1);
//     }
//     public static void main(String args[]){
//         int n=5;
//         print(n);
//     }
// }


//Program to print 1 to 5
public class Program1{
    public static void print(int n){
        if(n==6){
           
            return;
        }
        System.out.println(n);
        print(n+1);

    }
    public static void main(String[] args) {
        int n=1;
        print(n);
    }

}