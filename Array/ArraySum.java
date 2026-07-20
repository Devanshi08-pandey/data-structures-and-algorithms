import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArraySum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of 1st Array:");
        int n1=sc.nextInt();
        System.out.println("Enter Elements:");
        int [] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Size Of 2nd Array:");
        int n2=sc.nextInt();
         System.out.println("Enter Elements:");
        int [] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        if(n1>=n2) sum(arr1,arr2); 
        else sum(arr2,arr1);
        sc.close();
    }

    static void sum(int[] arr1,int[] arr2){
        ArrayList<Integer> ans=new ArrayList<>();
        int n1=arr1.length-1;
        int n2=arr2.length-1;
        int carry=0;
        while(n1>=0 || n2>=0 || carry!=0 ){
            int sum=carry;
            if(n1>=0) sum+=arr1[n1--];
            if(n2>=0) sum+=arr2[n2--];
            ans.add(sum%10);
            carry=sum/10;
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}