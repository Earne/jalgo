/**
 * @author gengyuanzhen
 */
public class MinimumDifferenceElement {
    public int searchMinimumDiffElement(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        if (key < arr[0]) {
            return arr[0];
        }
        if (key > arr[arr.length - 1]) {
            return arr[arr.length - 1];
        }
        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            }
            if (arr[mid] < key) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (arr[beg] - key) < (key - arr[end]) ? arr[beg] : arr[end];
    }
}
