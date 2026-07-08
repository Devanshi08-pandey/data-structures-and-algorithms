package Methods;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(a, b);
        System.out.println(Math.max(max,c));
        sc.close();
    }
}
