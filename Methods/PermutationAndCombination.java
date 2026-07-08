package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter r:");
        int r=sc.nextInt();
        int nCr=fact(n)/(fact(r)*fact(n-r));
        int nPr=fact(n)/fact(n-r);
        System.out.println("Permutation: "+nPr);
        System.out.println("Combination: "+nCr);
        sc.close();
    }
    public static int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f*=i;
        }
        return f;
    }
}
