import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rev=0;
        int count =0;
        int temp=n;
        while(n!=0){
            sum+=n%10;
            rev=rev*10+(n%10);
            count++;
            n/=10;
        }
        if(count==0) System.out.println("1");
        else System.out.println("Number Of Digits = "+count);
        System.out.println((sum>0)?"Sum is = "+sum:"Sum is = "+-sum);
        System.out.println("Reverse is = "+rev);
        System.out.println("Sum of Number And its Reverse is = "+ (temp+rev));
        sc.close();
    }
}
