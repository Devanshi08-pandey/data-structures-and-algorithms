import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     System.out.println("Enter Elements:");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
        if(i%2==0){
            arr[i]+=10;
        }
        else{
            arr[i]*=2;
        }
     }
     System.out.println(Arrays.toString(arr));
     sc.close();
   } 
}
