package BinarySearch;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maximumCount(arr));
        sc.close();
    }
    public static int maximumCount(int[] nums) {
        int n=nums.length,low=0,high=n-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<0){
               
                low=mid+1;
            }
            else high=mid-1;
        }
        int ne=low;
        low=0;high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=0){
                low=mid+1;
            }
            else high=mid-1;
        }
        int p=n-low;
        return Math.max(ne,p);
    }
}
