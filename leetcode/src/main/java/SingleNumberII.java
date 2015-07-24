/**
 *  Given an array of integers, every element appears three times except for one.
 *  Find that single one.
 *  Note:
 *  Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int one = 0, two = 0, three = 0;
        for (int i = 0; i < nums.length; i++) {
            two |= one & nums[i];
            one ^= nums[i];
            three = one & two;
            one &= ~three;
            two &= ~three;

        }
        return one;
    }
}
