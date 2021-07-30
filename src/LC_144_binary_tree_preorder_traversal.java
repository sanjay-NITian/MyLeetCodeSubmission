import java.util.ArrayList;
import java.util.List;

public class LC_144_binary_tree_preorder_traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> preorder = new ArrayList<>();
            helper(root, preorder);
            return preorder;
        }

        public static void helper(TreeNode root, List<Integer> preorder) {
            if (root == null) return;
            preorder.add(root.val);
            helper(root.left, preorder);
            helper(root.right, preorder);
        }
}
