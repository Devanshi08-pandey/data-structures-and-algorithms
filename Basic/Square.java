import java.util.Scanner;

public class Square {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Value: ");
    int n=sc.nextInt();
    System.out.println("Square is: "+n*n);
    sc.close();
   } 
}
