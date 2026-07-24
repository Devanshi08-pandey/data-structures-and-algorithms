import java.util.Arrays;
import java.util.Scanner;

public class Selection {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int n=sc.nextInt();
        System.out.println("Enter Elements:");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selection(arr);
        sc.close();
    }
    public static void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
