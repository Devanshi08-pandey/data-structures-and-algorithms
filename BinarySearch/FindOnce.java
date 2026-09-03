package BinarySearch;

import java.util.Scanner;

class FindOnce{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(single(arr));
        sc.close();
    }
    static int single(int[] arr) {
        // code here
        int n=arr.length;
        int low=0,high=n-1;
        if(n==1 || arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        while(low<high){
            int mid=(high+low)/2;
            if(mid%2==1) mid--;
            if(arr[mid]==arr[mid+1]) low=mid+2;
            else high=mid;
        }
        return arr[low];
    }
}
