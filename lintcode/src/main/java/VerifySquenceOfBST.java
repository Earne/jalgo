/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {
    public boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return helper(sequence, 0, sequence.length - 1);
    }

    private boolean helper(int[] sequence, int beg, int end) {
        if (beg >= end)
            return true;
        int rootval = sequence[end];
        int i;
        for (i = beg; i < end; i++) {
            if (sequence[i] > rootval)
                break;
        }

        // 判断剩余的是否都大于rootval
        for (; i < end; i++) {
            if (sequence[i] < rootval)
                return false;
        }

        // 递归判断左右子树
        boolean isLValid, isRValid;

        isLValid = helper(sequence, beg, i - 1);

        isRValid = helper(sequence, i, end - 1);

        return isLValid && isRValid;
    }
}
