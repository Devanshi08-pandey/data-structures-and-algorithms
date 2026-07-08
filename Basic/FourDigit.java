import java.util.Scanner;

public class FourDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>999 && n<10000) System.out.println("Yes");
        else System.out.println("NO");
        sc.close();
    }
}
