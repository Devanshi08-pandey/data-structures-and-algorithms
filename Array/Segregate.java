import java.util.Arrays;
import java.util.Scanner;

public class Segregate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        segregate0and1(arr);
        sc.close();
    }
    static void segregate0and1(int[] arr) {
        // code here
       int n=arr.length;
       int i=0,j=n-1;
       while(i<j){
           
           if(arr[i]==0) i++;
           else if(arr[j]==1) j--;
           else if(arr[i]==1 && arr[j]==0){
           arr[i]=0;
           arr[j]=1;
           i++;
           j--;
       }
       
       }
       System.out.println(Arrays.toString(arr));
    }
}
