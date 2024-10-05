
//check given array is sorted or not
public class Program2 {
    public static boolean check(int a[],int idx){
     if(idx==a.length-1){
        return true;
     }
       if( a[idx] < a[idx+1]){

       return check(a,idx+1);
       } else
       {
        return false;
       }
    }
    public static void main(String[] args) {
        int a[]={1,3,5};
      System.out.println( check(a,0));
        
    }
}
