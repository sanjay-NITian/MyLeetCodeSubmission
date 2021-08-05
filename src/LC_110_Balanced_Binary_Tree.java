public class LC_110_Balanced_Binary_Tree {
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


    // O(n)
    public boolean isBalanced(TreeNode root){
        if(root == null) return true;
        if(height(root) == -1) return false;
        return true;
    }

    public static int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int bf = Math.abs(lh-rh);   // This is the balance factor means if difference greater than 1 return false(-1)
        if(bf>1 || lh == -1 || rh == -1) return -1;
        else return Math.max(lh,rh) + 1;
    }



    // O(n^2)
    /*
    public boolean isBalanced(TreeNode root) {
        if(root == null ) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        if(Math.abs(lh-rh) > 1) return false;
        else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public static int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
    */
}
