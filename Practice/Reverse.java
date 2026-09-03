import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        System.out.print(sb.toString());
    }
}