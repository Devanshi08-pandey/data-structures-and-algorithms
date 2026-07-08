import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i:arr){
            max=Math.max(max,i);
        }
        System.out.println(max+" is largest");
        sc.close();
    }
}
