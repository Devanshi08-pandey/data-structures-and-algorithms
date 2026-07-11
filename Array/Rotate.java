import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Rotation Index:");
        int d=sc.nextInt();
        d=d%n;
         reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println("Final Array:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
