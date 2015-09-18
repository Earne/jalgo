/**
 * Created by earne on 9/9/15.
 */
public class QuickSort {
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int last = left;
        swap(arr, left, left + (right - left) / 2);

        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < arr[left])
                swap(arr, ++last, i);
        }
        swap(arr, left, last);
        quickSort(arr, left, last - 1);
        quickSort(arr, last + 1, right);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
