public class LC_112_Path_Sum {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


    public boolean hasPathSum(TreeNode root, int targetSum) {
        // base case
        if(root == null) return false;
        if(root.left == null && root.right == null && targetSum-root.val == 0) return true;

        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}
