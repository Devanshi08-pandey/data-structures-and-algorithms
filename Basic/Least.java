import java.util.Scanner;

public class Least {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<=b && a<=c) System.out.println(a+" is Least");
        else if(b<=a && b<=c) System.out.println(b+" is Least");
        else System.out.println(c+" is Least");
        sc.close();
    }
}
