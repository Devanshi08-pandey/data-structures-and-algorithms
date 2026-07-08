import java.util.Scanner;

public class CompositePrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        if(n==1) System.out.println("Neither Prime Nor Composite");
        boolean flag=true;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                flag=false;
                break;
            }
            
        }
        if(flag==false) System.out.println("Composite Number");
        else System.out.println("Prime Number");
        sc.close();
    }
}
