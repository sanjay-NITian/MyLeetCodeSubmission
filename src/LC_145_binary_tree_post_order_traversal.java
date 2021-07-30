import java.util.ArrayList;
import java.util.List;

public class LC_145_binary_tree_post_order_traversal {
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


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder= new ArrayList<>();
        helper(root,postorder);
        return postorder;
    }
    public static void helper(TreeNode root, List<Integer> postorder){
        if(root == null) return;

        helper(root.left,postorder);
        helper(root.right,postorder);
        postorder.add(root.val);
    }
}
