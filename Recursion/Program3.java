
//Factorial of n Number
public class Program3 {
    public static void print(int i,int n, int fact){
        if(i==n){
             fact*=i;
             System.out.println(fact);
            return;
        }
        fact=fact*i;
        // System.out.println(fact);
        print(i+1,n,fact);
    }
    public static void main(String args[]){
        print(1,5,1);
    }
}
