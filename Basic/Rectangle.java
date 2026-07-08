import java.util.Scanner;

public class Rectangle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
    int area=l*b;
    int p=2*(l+b);
    if(area>p) System.out.println("Area is greater than perimeter");
    else if(area<p) System.out.println("Perimeter is greater than area");
    else System.out.println("Both are equal");
    sc.close();
   } 
}
