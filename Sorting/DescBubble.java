import java.util.Arrays;
import java.util.Scanner;

public class DescBubble {
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
            int swap=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]>arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
