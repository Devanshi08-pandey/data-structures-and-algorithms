package Patterns;
import java.util.Scanner;
public class Alt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                for(int j=1;j<=n;j++){
                    System.out.print((char)(i+64)+" ");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=n;j++){
                    System.out.print((char)(i+96)+" ");
                }
                System.out.println();
            }
        }
        sc.close();

    }
}
