package ernest;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return null;
        }
        int[] result = new int[2];
        int p = 0, q = numbers.length - 1;
        while ( p < q) {
            int curSum = numbers[p] + numbers[q];
            if (curSum == target) {
                result[0] = p+1;
                result[1] = q+1;
                break;
            }
            if (curSum < target) {
                p++;
            } else {
                q--;
            }
        }
        return result;
    }
}
