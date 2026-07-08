import java.util.Scanner;

public class Magnitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            if(-n<69) System.out.println("True");
            else System.out.println("False");
        } 
        else{
            if(n<69) System.out.println("True");
            else System.out.println("False");
        }
        sc.close();
    }
}
