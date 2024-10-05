// Tower od Honai
public class Problem {
    public static void print(int n,String src,String helper,String dest){
     if(n==1){
        System.out.println("Transfer Desk "+n+" From "+src+" To "+dest);
        return;
     }

        print(n-1,src,dest,helper);
        System.out.println("Transfer Desk "+n+" From "+src+" To "+dest);
        print(n-1,helper,src,dest);
    }
    public static void main(String args[]){
        int n=3;
        print(n,"S","H","D");
    }
}
