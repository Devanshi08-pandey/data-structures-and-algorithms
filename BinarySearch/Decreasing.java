package BinarySearch;

import java.util.Scanner;

public class Decreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(binarySearch(arr,target));
        sc.close();
    }
    public static boolean binarySearch(int[] arr, int target) {
        // code here
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]<target) h=mid-1;
            else if(arr[mid]>target) l=mid+1;
            else return true;
        }
        return false;
    }
}
