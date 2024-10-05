//Print String in Reverse
public class Program1 {
    public static void print(String str,int idx){
      if(idx==0){
        System.out.println(str.charAt( idx));
        return;
      }
       System.out.print(str.charAt(idx));
       print(str,idx-1);
      }
      public static void main(String args[]){
        String str="abcd";
        print(str,str.length()-1);
      }
    }
  