import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZerosEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of 1st Array:");
        int n = sc.nextInt();
        System.out.println("Enter Elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pushZerosToEnd(arr);
        sc.close();
    }

    static void pushZerosToEnd(int[] arr) {
        
        
         int n=arr.length;
         ArrayList<Integer> list=new ArrayList<>();
          
         for(int i:arr){
         if(i!=0){
         list.add(i);
         }
         
         }
         for(int i=0;i<n;i++){
         arr[i]=0;
         }
         
         for(int i=0;i<list.size();i++){
         arr[i]=list.get(i);
         }
         
        // int n = arr.length;
        // int j = 0;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] != 0) {
        //         if (i != j) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //         j++;
        //     }
        // }

        System.out.println(Arrays.toString(arr));
    }

}
