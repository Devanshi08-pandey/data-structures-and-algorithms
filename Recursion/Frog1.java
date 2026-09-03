import java.util.Scanner;

public class Frog1 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(frog(n-1));
        sc.close();
    }
    static int frog(int i){
        if(i==0) return 0;
        if(i==1) return Math.abs(arr[1]-arr[0]);
        int one=frog(i-1)+Math.abs(arr[i]-arr[i-1]);
        int two=frog(i-2)+Math.abs(arr[i]-arr[i-2]);
        return Math.min(one,two);
    }
}
