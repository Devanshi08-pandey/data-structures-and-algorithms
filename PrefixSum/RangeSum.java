import java.util.Arrays;
import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pre=new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+arr[i-1];
        }
        System.out.println(Arrays.toString(pre));
        int q=sc.nextInt();
        for(int i=1;i<=q;i++){

            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(pre[r+1]-pre[l]);
        }
        sc.close();
    }
}
