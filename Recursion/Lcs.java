import java.util.*;

public class Lcs {
    static String[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int n = s.length();
        int m = t.length();
        dp = new String[n + 1][m + 1];
        System.out.println(solve(s, t, n, m));
        sc.close();
    }

    static String solve(String s, String t, int n, int m) {
        if (n == 0 || m == 0) {
            return "";
        }
        if (dp[n][m] != null) {
            return dp[n][m];
        }
        if (s.charAt(n - 1) == t.charAt(m - 1)) {
            dp[n][m] = solve(s, t, n - 1, m - 1)
                    + s.charAt(n - 1);
        }
        else {
            String a = solve(s, t, n - 1, m);
            String b = solve(s, t, n, m - 1);

            if (a.length() >= b.length()) {
                dp[n][m] = a;
            } else {
                dp[n][m] = b;
            }
        }
        return dp[n][m];
    }
}