package BinarySearch;

import java.util.Scanner;

public class Kth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.print(findKthPositive(arr,key));
        sc.close();
    }

    public static int findKthPositive(int[] arr, int k) {
       int n=arr.length,low=0,high=n-1;
       while(low<=high){
        int mid=(low+high)/2;
        int correct=mid+1;
        int missing=arr[mid]-correct;
        if(missing>=k) high=mid-1;
        else low=mid+1;
       } 
       return low+k;
    }
}
