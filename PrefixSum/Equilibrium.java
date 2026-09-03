import java.util.Scanner;

public class Equilibrium {
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
            pre[i]=pre[i-1]+arr[i];
        }
        suf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]+arr[i];
        }
        int index=-1;
        for(int i=0;i<n;i++){
            if(pre[i]==suf[i]) {
                index=i;
                break;
            }
        }
       System.out.println(index);
       /* Time Complexity will be same but space complexity will reduce
        int n=arr.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        long left=0;
        for(int i=0;i<n;i++){
            long right=sum-arr[i]-left;
            if(left==right) return i;
            left+=arr[i];
        }
        */
       sc.close();
    }
}
