import java.util.Arrays;
import java.util.Scanner;

public class Sort012{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort012(arr);
        sc.close();
    }

     public static void sort012(int[] arr) {
        int z=0,o=0,t=0;
        int n=arr.length;
        for(int i:arr){
            if(i==0) z++;
            else if(i==1) o++;
            else t++;
        }
        for(int i=0;i<z;i++){
            arr[i]=0;
        }
        for(int i=z;i<n-t;i++){
            arr[i]=1;
        }
        for(int i=z+o;i<n;i++){
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}