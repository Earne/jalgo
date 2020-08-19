/**
 * @author gengyuanzhen
 */
public class SearchBitonicArray {
    public int search(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int maxIndex = findMaxIndex(arr);
        int keyIndex = bSearch(arr, 0, maxIndex, key);
        if (keyIndex == -1) {
            return keyIndex;
        }
        return bSearch(arr, maxIndex, arr.length, key);
    }

    private int bSearch(int[] arr, int i, int maxIndex, int key) {
        int beg = i, end = maxIndex;
        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (arr[mid] == key) {
                return mid;
            }
        }
        return 0;
    }

    /**
     * 查找最大值的下标
     * @param arr 数组
     * @return 最大值的下标
     */
    private int findMaxIndex(int[] arr) {
        int beg = 0, end = arr.length - 1;
        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (arr[mid] < arr[mid + 1]) {
                beg = mid +1;
            } else {
                end = mid;
            }
        }
        return beg;
    }
}
