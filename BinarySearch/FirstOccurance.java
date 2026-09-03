package BinarySearch;

import java.util.Scanner;

public class FirstOccurance {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(firstSearch(arr,target));
        sc.close();
    }

    public static int firstSearch(int[] arr, int k) {
        // Code Here
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k) high=mid-1;
            else if(arr[mid]<k) low=mid+1;
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}
