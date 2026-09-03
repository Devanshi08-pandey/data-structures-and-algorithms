import java.util.Scanner;

public class Vacation {
    static int[][] arr;
    static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        System.out.println(rec(0, 3));
        sc.close();
    }

    static int rec(int day, int task) {
        if (day == n)
            return 0;

        int ans = 0;
        if (task != 0)
            ans = Math.max(ans,arr[day][0]+rec(day+1,0));
        if (task != 1)
            ans = Math.max(ans,arr[day][1]+rec(day+1,1));
        if (task != 2)
            ans = Math.max(ans, arr[day][2]+rec(day+1,2));
        return ans;
    }

}
