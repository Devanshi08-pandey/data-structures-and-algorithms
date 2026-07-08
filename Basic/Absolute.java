import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        if(n>=0) System.out.println("Absolute Number of "+n+" = "+n);
        else System.out.println("Absolute Number of "+n+" = "+ -n);
        sc.close();
    }
}
