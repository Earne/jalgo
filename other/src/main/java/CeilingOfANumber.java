/**
 * @author gengyuanzhen
 */
public class CeilingOfANumber {
    public static int searchCeilingOfANumber(int[] arr, int key) {
        if (arr == null || arr.length == 0 || arr[arr.length - 1] < key) {
            return -1;
        }

        // 左右指针（数组下标）
        int li = 0, hi = arr.length - 1;
        while (li < hi) {
            int mid = li + (hi - li) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                hi = mid;
            } else {
                li = mid + 1;
            }
        }
        return li;
    }

    public static void main(String[] args) {
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, 6));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{1, 3, 8, 10, 15}, 12));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, 17));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, -1));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{3, 5, 9}, 4));
    }
}
