package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(find(arr,target));
        sc.close();
    }
    static ArrayList<Integer> find(int arr[], int target) {
        // code here
        int n=arr.length;
        int low=0,high=n-1,f=-1,l=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                f=mid;
                high=mid-1;
            }
        }
        
        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                l=mid;
                low=mid+1;
            }
        }
        return new ArrayList<>(Arrays.asList(f, l));
    }
}
