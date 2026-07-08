import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 && n%3==0) System.out.println("Divisible by both 3 and 5");
        else if(n%3==0) System.out.println("Divisible by 3");
        else if(n%5==0) System.out.println("Divisible by 5");
        else System.out.println("Not Divisible by both 3 and 5");
        sc.close();
    }
}
