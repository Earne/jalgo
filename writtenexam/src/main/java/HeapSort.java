public class HeapSort {
    public static void heapSort(int[] arr) {
        // 建堆
        for (int i = arr.length / 2; i >= 0; i--) {
            helper(arr, i, arr.length);
        }

        // 排序
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            helper(arr, 0, i);
        }
    }

    private static void helper(int[] arr, int beg, int next) {
        int child;
        int tmp;
        for (tmp = arr[beg]; leftChild(beg) < next; beg = child) {
            child = leftChild(beg);
            if (child != next - 1 && arr[child] < arr[child + 1]) {
                child++;
            }
            if (tmp < arr[child]) {
                arr[beg] = arr[child];
            } else {
                break;
            }
        }
        arr[beg] = tmp;
    }

    private static int leftChild(int i) {
        return i * 2 + 1;
    }

    private static void swap(int[] arr, int p, int q) {
        int tmp = arr[p];
        arr[p] = arr[q];
        arr[q] = tmp;
    }
}
