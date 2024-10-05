public class Program4 {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void print(String str,int idx,String Combo){
      if(idx==str.length()){
        System.out.println(Combo);
        return;
      }
        char curChar=str.charAt(idx);
        String mapping=keypad[curChar-'0'];

        for(int i=0; i<mapping.length();i++){
            print(str, idx+1, Combo+mapping.charAt(i));
            
        }
    }
    public static void main(String args[]){
        String str="23";
        print(str, 0, "");
    }
}
