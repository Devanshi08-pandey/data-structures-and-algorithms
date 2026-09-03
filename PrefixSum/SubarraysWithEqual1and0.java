import java.util.HashMap;
import java.util.Scanner;

public class SubarraysWithEqual1and0 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countSubarray(arr));
        sc.close();
    }
     public static int countSubarray(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) arr[i]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0,sum=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }    
}
