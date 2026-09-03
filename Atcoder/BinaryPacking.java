import java.io.*;
import java.util.*;

public class BinaryPacking {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            long[] A = new long[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                A[i] = Long.parseLong(st.nextToken());
            }
            PriorityQueue<Long> pq = new PriorityQueue<>();
            long usedBags = 0;
            for (int i = M - 1; i >= 0; i--) {
                long count = A[i];
                long weight = 1L << i;

                while (count > 0) {
                    if (usedBags < N) {
                        pq.add(weight);
                        usedBags++;
                    } else {
                        long smallest = pq.poll();
                        pq.add(smallest + weight);
                    }
                    count--;
                }
            }
            long answer = 0;
            while (!pq.isEmpty()) {
                answer = Math.max(answer, pq.poll());
            }
            out.append(answer).append('\n');
        }
        System.out.print(out);
    }
}