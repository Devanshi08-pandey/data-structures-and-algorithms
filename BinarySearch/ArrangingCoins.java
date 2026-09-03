package BinarySearch;

import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println(arrangeCoins(n)); 
       sc.close();
    }
    // public static int arrangeCoins(int n) {
    //     long m=(long)n;
    //     return (int)(sqrt(8*m+1)-1)/2;
        
    // }

    // public static long sqrt(long x) {
    //     long low=0;
    //     long high=x;
    //     long ans=x;
    //     while(low<=high){
    //         long mid=low+(high-low)/2;
    //         if(mid<=x/mid){
    //             ans=mid;
    //             low=mid+1;
    //         }
    //         else high=mid-1;
    //     }
    //     return ans;
    // }

     public static int arrangeCoins(int n) {
        long low=1,high=n,ans=0;
        while(low<=high){
            long k=low+(high-low)/2;
            long m=(k*(k+1))/2;
            if(m==n) return (int)k;
            else if(m>n) high=k-1;
            else{
                ans=k;
                low=k+1;
            }
            
        }
        return (int)ans;
    }
}

