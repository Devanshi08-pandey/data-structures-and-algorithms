import java.util.Arrays;
import java.util.Scanner;

public class Wave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortInWave(arr);
        sc.close();
    }
    public static void sortInWave(int arr[]) {
        for(int i=0;i<arr.length;i+=2){
            int j=i+1;
            if(j<arr.length){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
            else break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
