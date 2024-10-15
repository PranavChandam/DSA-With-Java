import java.util.*;

public class SelectionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements:");
        int size=sc.nextInt();

        int a[]=new int[size];
        System.out.println("Enter Elements to be Sorted:");
         for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
         }
        for(int i=0;i<size-1;i++){
            int smallest=i;
            for(int j=i+1;j<size;j++){
                if(a[smallest]>a[j]){
                    smallest=j;
            }
            
        int temp=a[smallest];
        a[smallest]=a[i];
        a[i]=temp;

        }
    }
    System.out.println("Sorted Elements are:");
    for(int i=0;i<size;i++){
        System.out.println(a[i]);
    }
}
}