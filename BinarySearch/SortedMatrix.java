package BinarySearch;

import java.util.Scanner;

public class SortedMatrix {
    public static boolean search(int[][] mat, int x) {
        // code here
        int row=mat.length,col=mat[0].length;
        int low=0,high=row*col-1;
        while(low<=high){
            int mid=(low+high)/2;
            int midrow=mid/col;
            int midcol=mid%col;
            if(mat[midrow][midcol]==x) return true;
            else if(mat[midrow][midcol]>x) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        int key=sc.nextInt();
        System.out.print(search(arr,key));
        sc.close();
    }
}
