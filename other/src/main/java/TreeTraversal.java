import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 对树进行遍历
 *
 * @author Ernest
 */
public class TreeTraversal {

    private static final Action CHULI = Action.CHULI;
    private static final Action PRINT = Action.PRINT;

    /**
     * 前序-递归
     */
    public List<Integer> preOrderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderRecursive(root, result);
        return result;
    }

    /**
     * 前序-递归辅助方法；放入null节点
     */
    private void preOrderRecursive(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        preOrderRecursive(node.left, res);
        preOrderRecursive(node.right, res);
    }

    /**
     * 中序-递归
     */
    public List<Integer> inOrderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderRecursive(root, result);
        return result;
    }

    /**
     * 中序-递归辅助方法；放入null节点
     */
    private void inOrderRecursive(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        preOrderRecursive(node.left, res);
        res.add(node.val);
        preOrderRecursive(node.right, res);
    }

    /**
     * 后序-递归
     */
    public List<Integer> postOrderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderRecursive(root, result);
        return result;
    }

    /**
     * 后序-递归辅助方法；放入null节点
     */
    private void postOrderRecursive(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        preOrderRecursive(node.left, res);
        preOrderRecursive(node.right, res);
        res.add(node.val);
    }

    // 递归，不放入null

    /**
     * 前序-递归,不放入null
     */
    public List<Integer> preOrderRecursiveNoNull(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        preOrderRecursiveNoNull(root, result);
        return result;
    }

    /**
     * 前序-递归辅助方法；不放入null节点
     */
    private void preOrderRecursiveNoNull(TreeNode node, List<Integer> res) {
        res.add(node.val);
        if (node.left != null) {
            preOrderRecursive(node.left, res);
        }
        if (node.right != null) {
            preOrderRecursive(node.right, res);
        }
    }

    /**
     * 前序-非递归-借助Task及Action模拟堆栈-放入null
     */
    public List<Integer> preOrderTask(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<Task> stack = new Stack<>();
        stack.push(new Task(root, CHULI));
        while (!stack.isEmpty()) {
            Task peek = stack.pop();
            TreeNode node = peek.node;
            if (node == null) {
                continue;
            }
            switch (peek.action) {
                case CHULI:
                    stack.push(new Task(node.right, CHULI));
                    stack.push(new Task(node.left, CHULI));
                    stack.push(new Task(node, PRINT));
                    break;
                case PRINT:
                    result.add(node.val);
                    break;
                default:
                    break;
            }
        }
        return result;
    }


    /**
     * 前序-非递归-借助Task及Action模拟堆栈-不放入null
     */
    public List<Integer> preOrderTaskNoNull(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Task> stack = new Stack<>();
        stack.push(new Task(root, CHULI));
        while (!stack.isEmpty()) {
            Task peek = stack.pop();
            TreeNode node = peek.node;
            switch (peek.action) {
                case CHULI:
                    if (node.right != null) {
                        stack.push(new Task(node.right, CHULI));
                    }
                    if (node.left != null) {
                        stack.push(new Task(node.left, CHULI));
                    }
                    stack.push(new Task(node, PRINT));
                    break;
                case PRINT:
                    result.add(node.val);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    /**
     * 中序-非递归-借助Task及Action模拟堆栈-放入null
     */
    public List<Integer> inOrderTask(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<Task> stack = new Stack<>();
        stack.push(new Task(root, CHULI));
        while (!stack.isEmpty()) {
            Task peek = stack.pop();
            TreeNode node = peek.node;
            if (node == null) {
                continue;
            }
            switch (peek.action) {
                case CHULI:
                    stack.push(new Task(node.right, CHULI));
                    stack.push(new Task(node, PRINT));
                    stack.push(new Task(node.left, CHULI));
                    break;
                case PRINT:
                    result.add(node.val);
                    break;
                default:
                    break;
            }
        }
        return result;
    }


    /**
     * 中序-非递归-借助Task及Action模拟堆栈-不放入null
     */
    public List<Integer> inOrderTaskNoNull(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Task> stack = new Stack<>();
        stack.push(new Task(root, CHULI));
        while (!stack.isEmpty()) {
            Task peek = stack.pop();
            TreeNode node = peek.node;
            switch (peek.action) {
                case CHULI:
                    if (node.right != null) {
                        stack.push(new Task(node.right, CHULI));
                    }
                    stack.push(new Task(node, PRINT));
                    if (node.left != null) {
                        stack.push(new Task(node.left, CHULI));
                    }
                    break;
                case PRINT:
                    result.add(node.val);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    /**
     * 前序-非递归-模拟堆栈-放入null
     */
    public List<Integer> preOrderIterNull(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode peek = stack.pop();
            if (peek == null) {
                continue;
            }
            result.add(peek.val);
            stack.push(peek.right);
            stack.push(peek.left);
        }
        return result;
    }

    /**
     * 前序-非递归-模拟堆栈-不放入null
     */
    public List<Integer> preOrderIterNoNull(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode peek = stack.pop();
            if (peek.right != null) {
                stack.push(peek.right);
            }
            if (peek.left != null) {
                stack.push(peek.left);
            }
            result.add(peek.val);
        }
        return result;
    }

    /**
     * 中序-非递归-模拟堆栈-不放入null
     */
    public List<Integer> inOrderIterNoNull(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        stack.push(node);
        while (node.left != null) {
            stack.push(node.left);
            node = node.left;
        }
        while (!stack.isEmpty()) {
            TreeNode peek = stack.pop();
            result.add(peek.val);
            if (peek.right != null) {
                node = peek.right;
                stack.push(node);
                while (node.left != null) {
                    stack.push(node.left);
                    node = node.left;
                }
            }
        }
        return result;
    }

    public List<Integer> postOrderIterNotNull(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        // 标记上一个出栈（即打印出来）的node
        TreeNode pre = null;
        // 标记上一个动作是true出栈（打印val）还是false入栈（刚刚加入了root， 因此是入栈 false）
        boolean isPop = false;
        while (!stack.isEmpty()) {
            TreeNode peek = stack.peek();
            // 上一个动作不是出栈，且peek的左非空，那么可以把左边入栈
            if (!isPop && peek.left != null) {
                stack.push(peek.left);
            } else {
                // 否则，要么上一个动作是出栈,或者peek的左是空。即 1 出栈 ； 2 左边是空；1 出栈又包括出栈点和当前点的关系
                if (isPop) {
                    if (peek.left == pre) {
                        // 如果上一个动作是出栈，那么要看出栈的点和当前点的关系，如果是左子，那么可以将非空的右子入栈了
                        if (peek.right != null) {
                            stack.push(peek.right);
                            isPop = false;
                        } else {
                            // 如果右子是空，那么当前可以出栈了
                            isPop = true;
                            pre = peek;
                            result.add(stack.pop().val);
                        }
                    } else {
                        // 再否则如果上个动作是出栈，但是不是左子（那么肯定是右子了），那么当前点也可以出栈了
                        isPop = true;
                        pre = peek;
                        result.add(stack.pop().val);
                    }
                } else {
                    // 到这里的一定是：  上个动作不是出栈，但peek的左是空，那么根据情况，将右边加入进来或者弹出peek
                    if (peek.right != null) {
                        stack.push(peek.right);
                    } else {
                        isPop = true;
                        pre = peek;
                        result.add(stack.pop().val);
                    }
                }
            }
        }

        return result;
    }


    public List<Integer> postOrderIterOri(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode peek;
        TreeNode pre = null;
        boolean isPop = false;
        while (!stack.isEmpty()) {
            peek = stack.peek();
            if (!isPop && peek.left != null) {
                stack.push(peek.left);
            } else {
                isPop = false;
                if (peek.right == null || peek.right == pre) {
                    pre = stack.pop();
                    result.add(pre.val);
                    isPop = true;
                } else {
                    stack.push(peek.right);
                }
            }
        }
        return result;
    }
}

class Task {
    TreeNode node;
    Action action;

    public Task(TreeNode node, Action action) {
        this.node = node;
        this.action = action;
    }
}

enum Action {
    /**
     * 需要处理以该点为根的子树
     */
    CHULI,
    /**
     * 打印该节点
     */
    PRINT
}
