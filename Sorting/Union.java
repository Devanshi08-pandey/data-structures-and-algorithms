import java.util.ArrayList;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of 1st Array:");
        int n1 = sc.nextInt();
        System.out.println("Enter Elements:");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size Of 2nd Array:");
        int n2 = sc.nextInt();
        System.out.println("Enter Elements:");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        findUnion(arr1, arr2);
        sc.close();
    }

    public static void findUnion(int a[], int b[]) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++;
            }
        }

        while (i < a.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }
        while (j < b.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }
        System.out.println(list);
    }
}
