import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int n=sc.nextInt();
        System.out.println("Enter Elements:");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        sc.close();
    }
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
