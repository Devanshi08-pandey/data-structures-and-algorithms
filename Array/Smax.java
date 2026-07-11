import java.util.Scanner;

public class Smax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(second(arr));
        sc.close();
    }
    static int second(int [] arr){
        int l=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i:arr){
            l=Math.max(l,i);
        }
        for(int i:arr){
            if(i>smax && i!=l){
                smax=Math.max(smax,i);
            }
        }
            return smax;
    }
}
