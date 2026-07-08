package TernaryOperator;

import java.util.Scanner;

public class Greatest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number1:");
        int a=sc.nextInt();
        System.out.print("Enter Number2:");
        int b=sc.nextInt();
        System.out.print("Enter Number3:");
        int c=sc.nextInt();
        Greatest g=new Greatest();
        System.out.println(g.greatest(a, b, c));
        sc.close();
    }
    public int greatest(int a,int b,int c){
        return ((a>b)?((a>c)?a:c):((b>c)?b:c));
    }
}