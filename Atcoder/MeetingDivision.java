import java.io.*;
import java.util.*;

public class MeetingDivision {
    static final long MOD = 998244353L;

    static class Meeting {
        int s, t;

        Meeting(int s, int t) {
            this.s = s;
            this.t = t;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Meeting[] a = new Meeting[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = new Meeting(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(a, (x, y) -> Integer.compare(x.s, y.s));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Meeting m : a) {
            while (!pq.isEmpty() && pq.peek() < m.s) {
                pq.poll();
            }

            // 2 meetings are already active
            if (pq.size() >= 2) {
                System.out.println(0);
                return;
            }

            pq.add(m.t);
        }

        // Find connected components
        int components = 0;
        int right = -1;

        for (Meeting m : a) {
            if (m.s > right) {
                components++;
            }

            right = Math.max(right, m.t);
        }

        long ans = 1;

        for (int i = 0; i < components; i++) {
            ans = ans * 2 % MOD;
        }

        System.out.println(ans);
    }
}