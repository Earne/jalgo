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
