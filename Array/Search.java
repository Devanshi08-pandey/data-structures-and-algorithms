import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number of Elements:");
     int n=sc.nextInt();
     System.out.println("Enter Elements:");
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     System.out.println("Enter Element to Search:");
     int search=sc.nextInt();
     boolean flag=false;
     for(int i:arr){
        if(search==i){
            flag=true;
            break;
        }
     }
     if(flag) System.out.println("Yes");
     else System.out.println("No");
     sc.close();
    }
}
