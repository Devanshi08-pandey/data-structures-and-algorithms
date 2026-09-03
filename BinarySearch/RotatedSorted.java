package BinarySearch;

import java.util.Scanner;

public class RotatedSorted {
    public static int search(int[] arr, int key) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if(arr[low]<arr[mid]){
                if(arr[low]==key) return low;
                else if(arr[low]<key && key<arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
               if(arr[high]==key) return high; 
               else if(arr[mid]<key && key<arr[high]) low=mid+1;
               else high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.print(search(arr,key));
        sc.close();
    }
}
