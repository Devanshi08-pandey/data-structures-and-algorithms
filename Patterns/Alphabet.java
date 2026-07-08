package Patterns;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=26){
            for(int i=1;i<=n;i++){
            for(char a='A';a<'A'+n;a++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        }
        else System.out.println("Invalid input");
        sc.close();
    }
}
