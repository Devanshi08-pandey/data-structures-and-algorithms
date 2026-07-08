import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] x={10,20,30,40};
        int[] arr=x;//Shallow Copy
        arr[0]=100;
        System.out.println(x[0]);

        int[] deep=Arrays.copyOf(arr, arr.length);//deep Copy
        deep[1]=100;
        System.out.println(x[1]);
    }
}
