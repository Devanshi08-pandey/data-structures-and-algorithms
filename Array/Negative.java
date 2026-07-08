import java.util.Scanner;

public class Negative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Number: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Negative Numbers: ");
        for(int i:arr){
            if(i<0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}