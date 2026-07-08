package Methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
        sc.close();
    }
    public static void swap(int a,int b){
         a=a^b;
         b=a^b;
         a=a^b;
         System.out.println(a+" "+b);
    }
}
