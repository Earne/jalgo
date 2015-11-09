import java.util.Arrays;

public class CtripFoo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3};
        for (Integer num: arr) {
            num = new Integer(12);
        }
        System.out.println(Arrays.toString(arr));
    }
}
