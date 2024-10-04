
// print Fibonacci series
public class Program4 {
    public static void print(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
       System.out.println(c);
       print(b,c,n-1);
    }
    public static void main(String args[]){
     int a=0,b=1;
     System.out.println(a);
     System.out.println(b);
     int n=7;
     print(a,b,n-1);//n=2   print(a,b,n-2);
    }
}
