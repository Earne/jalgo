public class FindCorruptNums {
    public static int[] findNumbers(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }

        int i = 0;
        while (i < nums.length) {
            int j = nums[i];
            if (nums[j - 1] == j) {
                i++;
            } else {
                swap(nums, i, j - 1);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{j + 1, nums[j]};
            }
        }
        return new int[] { -1, -1 };
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
