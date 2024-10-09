

import java.util.*;
  public class BubbleSort{
    public static void printarray(int a[],int size){
    System.out.println("Sorted Elements are:");
    for(int i=0;i<size;i++){
     System.out.println(a[i]);
    }
}
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
       System.out.print("Enter Number of Elements:");
      int size=sc.nextInt();
       int a[]=new int[size];
       System.out.println("Enter elements to be sorted:");
       for(int i=0;i<size;i++){
        a[i]=sc.nextInt();
       }
       for(int i=0;i<size-1;i++){
        for(int j=0;j<size-1-i;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
       }
      printarray(a,size);
       }
    }


