import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        if (n % 2 == 0 && n != 2) flag = false;
        for (int i = 3; i<= Math.sqrt(n) && flag; i += 2)
        {
            if (n % i == 0) {
                flag = false;
            }
        }
        if(n==1) System.out.println("Neither Prime Nor Composite");
        else if(flag==false) System.out.println("Composite Number");
        else System.out.println("Prime Number");
        sc.close();
    }
}
