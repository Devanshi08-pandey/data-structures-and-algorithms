import java.util.Scanner;

public class Frog2 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(frog((n - 1), k));
        sc.close();
    }

    static int frog(int i, int k) {
        if (i == 0)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int j = 1; j <= k && i - j >= 0; j++) {
            int jump = frog(i - j, k) + Math.abs(arr[i] - arr[i - j]);
            min = Math.min(min, jump);
        }

        return min;
    }
}
