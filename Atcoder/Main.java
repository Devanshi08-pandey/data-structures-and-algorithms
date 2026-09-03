import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in = new StreamTokenizer(br);
        in.nextToken();
        int t = (int) in.nval;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            in.nextToken();
            int h = (int) in.nval;
            in.nextToken();
            int w = (int) in.nval;
            solve(h, w, sb);
        }
        System.out.print(sb);
    }

    static void solve(int h, int w, StringBuilder sb) {
        int max = (h * w) / 4;
        sb.append(max).append('\n');
        boolean[][] used = new boolean[h + 1][w + 1];
        int count = 0;
        for (int s = 1; s < Math.max(h, w); s++) {
            for (int r = 1; r + s <= h; r++) {
                for (int c = 1; c + s <= w; c++) {
                    if (!used[r][c] && !used[r + s][c] && !used[r][c + s] && !used[r + s][c + s]) {
                        used[r][c] = used[r + s][c] = used[r][c + s] = used[r + s][c + s] = true;
                        sb.append(r).append(' ').append(c).append(' ').append(s).append('\n');
                        if (++count == max)
                            return;
                    }
                }
            }
        }
    }
}
