import java.io.*;
import java.util.*;

public class Prefix {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;

      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int q = Integer.parseInt(st.nextToken());

      long[] pre = new long[n + 1];
      st = new StringTokenizer(br.readLine());

      for (int i = 1; i <= n; i++) {
         pre[i] = pre[i - 1] + Long.parseLong(st.nextToken());
      }

      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < q; i++) {
         st = new StringTokenizer(br.readLine());
         int l = Integer.parseInt(st.nextToken());
         int r = Integer.parseInt(st.nextToken());

         sb.append(pre[r] - pre[l - 1]).append('\n');
      }

      System.out.print(sb);
   }
}