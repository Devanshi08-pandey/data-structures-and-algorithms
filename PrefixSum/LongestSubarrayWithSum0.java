import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSum0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(longestSubarray(arr));
        sc.close();
    }
    public static int longestSubarray(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0,sum=0,n=arr.length,k=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                ans=Math.max(ans,i+1);
            }
            else{
                int diff=sum-k;
                if(map.containsKey(diff)){
                    int j=map.get(diff);
                    ans=Math.max(ans,i-j);
                }
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return ans;
    }
}

