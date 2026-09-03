import java.util.Scanner;

public class MaximumSumRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<m;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxRectSum(arr));
        sc.close();
    }
    static int findSum(int[][] mat,int i,int j,int x,int y){
        int ans=mat[x][y];
        if((j-1)>=0) ans-=mat[x][j-1];
        if((i-1)>=0) ans-=mat[i-1][y];
        if((i-1)>=0 && (j-1)>=0) ans+=mat[i-1][j-1];
        return ans;
    }
    public static int maxRectSum(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            //prefix sum for each row
            for(int j=1;j<m;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int j=0;j<m;j++){
            //prefix sum for each column
            for(int i=1;i<n;i++){
                mat[i][j]+=mat[i-1][j];
            }
        }
        // (i,j)->(x,y)
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int x=i;x<n;x++){
                    for(int y=j;y<m;y++){
                        //sum of submatrix (i,j)->(x,y)
                        int sum=findSum(mat,i,j,x,y);
                        ans=Math.max(ans,sum);
                    }
                }
            }
        }
        return ans;
    }
}
