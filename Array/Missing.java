import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(missingNum(arr));
        sc.close();
    }
    static int missingNum(int arr[]) {
        int n=arr.length+1;
        long sum=(long)(n*(n+1))/2;
        long s=0;
        for(int i:arr){
            s+=i;
        }
        return (int)(sum-s);
    }
}
