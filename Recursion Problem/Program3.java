//Print all subsequences of string
public class Program3{
    public static void print(String str,int idx,String newString){
     if(idx==str.length()){
        System.out.println(newString);
        return;
     }


        char currChar=str.charAt(idx);
        print(str, idx+1, newString+currChar);
        print(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        print(str, 0, "");
    }
}

////////////////IMPORTANT CODE /////////////////////