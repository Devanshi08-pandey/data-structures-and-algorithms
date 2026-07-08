import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Power: ");
        int b=sc.nextInt();
        int pow=1;
        if(b==1) System.out.println(a);
        else{
        while(b>0){
           pow*=a;
           b--;
        }
        System.out.println(pow);
        }
        sc.close();
    }
}
