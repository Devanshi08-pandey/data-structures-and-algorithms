import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Pallindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int og=n;
        int rev=0;
        while(n>0){
            int num=n%10;
            rev=rev*10+num;
            n/=10;
        }
        if(og==rev) System.out.print("True");
        else System.out.print("False");
       
    }
}
