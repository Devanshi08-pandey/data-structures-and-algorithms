import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class IndexesOfSubarraySum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(subarraySum(arr,target));
        sc.close();
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int extraSum=sum-target;
            if(extraSum==0){
                 return new ArrayList<>(Arrays.asList(1, i + 1));
            }
            if (map.containsKey(extraSum)) {
                int j=map.get(extraSum);
                return new ArrayList<>(Arrays.asList(j + 2, i + 1));
            }
            if(!map.containsKey(sum))
            map.put(sum,i);
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
}