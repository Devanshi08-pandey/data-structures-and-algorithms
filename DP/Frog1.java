package DP;
import java.util.Arrays;
import java.util.Scanner;

//---------------------------------------------Memoization---------------------------------------------------------------
public class Frog1 {
static int[] arr;
static int[] dp;
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
arr=new int[n];
dp=new int[n];
Arrays.fill(dp,-1);
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println(frog(n-1));
sc.close();
}
static int frog(int i){
if(i==0) return 0;
if(i==1) return Math.abs(arr[1]-arr[0]);
if(dp[i]!=-1) return dp[i];
int one=frog(i-1)+Math.abs(arr[i]-arr[i-1]);
int two=frog(i-2)+Math.abs(arr[i]-arr[i-2]);
return dp[i]=Math.min(one,two);
}
}

// --------------------------------Tabulation Approach------------------------------------------------------
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int[] dp = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         dp[0] = 0;

//         if (n > 1) {
//             dp[1] = Math.abs(arr[1] - arr[0]);
//         }

//         for (int i = 2; i < n; i++) {
//             int one = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
//             int two = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
//             dp[i] = Math.min(one, two);
//         }

//         System.out.println(dp[n - 1]);
//         sc.close();
//     }
// }