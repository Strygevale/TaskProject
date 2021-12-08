import java.util.Arrays;

public class Value {
    public static void main(String[] args) {
        int[] arr = {6, 15, 25, 8, 1, 10};
        Arrays.sort(arr);
        for (int i = arr.length - 3; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
