public class Program5 {
    public static int print(int x,int n){
       if(n==0){
        return 1;
       }
       if(x==0){
        return 0;
       }
       int xPower= print(x,n-1);
       int xpow1=x* xPower;
       return xpow1;
        }
        public static void main(String args[]){
            int x=2,n=5;
            int ans=print(x,n);
            System.out.println(ans);
        }
    }

