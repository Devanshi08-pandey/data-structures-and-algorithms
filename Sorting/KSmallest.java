import java.util.Scanner;

public class KSmallest {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int n=sc.nextInt();
        System.out.println("Enter Elements:");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter K:");
        int k=sc.nextInt();
        System.out.println(sort(arr,k));
        sc.close();
    }
    public static int sort(int[] arr,int k){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        return arr[k-1];
    }
}
