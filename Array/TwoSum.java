import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target Element:");
        int target=sc.nextInt();
        System.out.println(twoSum(arr,target));
        sc.close();
    }
    static boolean twoSum(int arr[], int target) {
        /*Complexity->O(n^2)
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) return true;
            }
        }
        return false;
        */
       //Complexity->O(n log n)
       Arrays.sort(arr);
       int j=arr.length-1;
        int i=0;
        while(i<j){
            if(arr[i]+arr[j]==target) return true;
            else if(arr[i]+arr[j]<target) i++;
            else j--;
        }
        return false;
    }
}
