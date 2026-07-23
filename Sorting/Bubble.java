import java.util.Arrays;
import java.util.Scanner;
public class Bubble{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of 1st Array:");
        int n=sc.nextInt();
        System.out.println("Enter Elements:");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr);
        sc.close();
    }
    public static void bubble(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        System.out.println(Arrays.toString(arr));

        /* Average Case
        for(int i=0;i<n-1;i++){
            int swaps=0;
            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swaps++;
            }
        }
            if(swaps==0) break;
        }
         */
    }
}