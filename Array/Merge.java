import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] a = { 2, 5, 6, 9 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] c = new int[a.length + b.length];
        merge(c, a, b);
        System.out.println(Arrays.toString(c));
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        while(i<a.length && j<b.length)
        c[k++]=(a[i]<b[j])?a[i++]:b[j++];
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
        
        // while (i < a.length && j < b.length) {
        //     if (a[i] < b[j]) {
        //         c[k] = a[i];
        //         i++;
        //     } else {
        //         c[k] = b[j];
        //         j++;
        //     }
        //     k++;
        // }

        // if (i == a.length) {
        //     while (j < b.length) {
        //         c[k++] = b[j++];
        //     }
        // }
        // if (j == b.length) {
        //     while (i < a.length) {
        //         c[k++] = a[i++];
        //     }
        // }
        
       
         
    }
}
