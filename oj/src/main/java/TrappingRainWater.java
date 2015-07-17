/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * <p>
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int res = 0;
        if (height.length <= 2)
            return 0;
        int pre = 0, next = 0;

        for (int i = 1; i < height.length; i++) {
            if (i <= pre)
                continue;
            while (pre < height.length - 1 && height[pre] <= height[pre + 1])
                pre++;
            if (i <= pre)
                continue;
            if (next < i) {
                next = pre + 1;
                int tmp = next;
                while (next < height.length) {
                    if (height[next] > height[tmp])
                        tmp = next;
                    next++;
                }
                next = tmp;
            }
            if (height[i] > height[pre])
                pre = i;
            if (i == next)
                pre = next;
            else if (height[i] < Math.min(height[pre], height[next]))
                res += Math.min(height[pre], height[next]) - height[i];

        }
        return res;
    }

    // TODO refactor this
}
