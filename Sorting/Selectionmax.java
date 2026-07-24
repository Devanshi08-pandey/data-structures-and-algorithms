import java.util.Arrays;
import java.util.Scanner;

public class Selectionmax{
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
        for(int i=n-1;i>0;i--){
            int max=Integer.MIN_VALUE;
            int maxdx=-1;
            for(int j=i;j>=0;j--){
                if(arr[j]>max){
                    max=arr[j];
                    maxdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}