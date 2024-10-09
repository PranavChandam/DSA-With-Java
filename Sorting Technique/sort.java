import java.util.*;

public class sort{
    public static void main(String args[]){
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of Elements:");
    int size=sc.nextInt();
    int a[]=new int[size]; 
    System.out.println("Enter number to be sort:");
    for(int i=0;i<size;i++){
         a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    System.out.println("Sorted numbers are:");
    for(int i=0;i<size;i++){
    System.out.println("Sorted array is:"+a[i]);
}
}}