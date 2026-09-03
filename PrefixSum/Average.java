import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pre=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
           pre[i]=sum/(i+1);
        }
        System.out.println(Arrays.toString(pre));
        sc.close();
    }
}
