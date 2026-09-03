import java.util.Arrays;
import java.util.Scanner;

public class ProductPuzzle {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pre=new int[n];
        int[] suf=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*arr[i];
        } 
        suf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]*arr[i];
        }
        arr[0]=suf[1];
        arr[n-1]=pre[n-2];
        for(int i=1;i<n-1;i++){
            arr[i]=pre[i-1]*suf[i+1];
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
