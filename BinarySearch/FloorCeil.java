package BinarySearch;

import java.util.Scanner;

public class FloorCeil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println("CEIL : "+findCeil(arr,target));
        System.out.println("FLOOR : "+findFloor(arr,target));
        sc.close();
    }

    public static int findCeil(int[] arr, int x) {
        // code here
        int ans=-1,n=arr.length,low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    static int findFloor(int[] arr, int x) {
        // code here
        int max=-1;
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]<=x){
                max=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return max;
    }
}
