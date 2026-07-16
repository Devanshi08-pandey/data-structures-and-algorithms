import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(12);
        arr.add(8);
        arr.add(18);
        arr.add(10);
        System.out.println(arr.get(2));//arr[2]
        arr.set(1,50);//arr[1]=50
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(4);
        Collections.reverse(arr);
        System.out.println(arr);
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
