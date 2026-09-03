package BinarySearch;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=1,end=n,ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid*mid<=n){
                ans=mid;
                start=mid+1;
            }
            else end=mid-1;
        }
        System.out.println(ans);
        sc.close();
    }
}
