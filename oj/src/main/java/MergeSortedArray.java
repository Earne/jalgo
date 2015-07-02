/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold
 * additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0) {
            if (m == 0) {
                nums1[m + n - 1] = nums2[n-- - 1];
            } else {
                nums1[m + n - 1] = (nums1[m - 1] > nums2[n - 1]) ? nums1[m-- - 1] : nums2[n-- - 1];
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int s = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums2[n] > nums1[m]) {
                nums1[s--] = nums2[n];
                n--;
            } else {
                nums1[s--] = nums1[m];
                m--;
            }
        }

        while (n >= 0) {
            nums1[s--] = nums2[n];
            n--;
        }
    }
}
