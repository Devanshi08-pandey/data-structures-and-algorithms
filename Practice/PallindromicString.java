import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PallindromicString{
   public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s=br.readLine().toLowerCase();
      StringBuffer sb=new StringBuffer();
      for(int i=s.length()-1;i>=0;i--){
         sb.append(s.charAt(i));
      }
      
      if(s.equals(sb.toString())) System.out.print("True");
      else System.out.println("False");
      
   }
}
