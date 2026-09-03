import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));
        sc.close();
    }

    
static boolean prime(int n){
    if(n==2) return true;
    if(n==1 || n%2==0) return false;
    for(int i=3;i*i<=n;i++){
        if(n%i==0) return false;
    }
        return true;
    }
}
