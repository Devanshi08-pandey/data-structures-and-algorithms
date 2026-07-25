import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {
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
         commonElements(arr1,arr2);
        sc.close();
    }

    public static void commonElements(int a[], int b[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]) {
                list.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else j++;
        }
        System.out.println(list);
    }
}
