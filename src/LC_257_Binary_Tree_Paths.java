import java.util.ArrayList;
import java.util.List;

public class LC_257_Binary_Tree_Paths {
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


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root,"",ans);
        return ans;
    }

    public static void helper(TreeNode root,String temp,List<String> ans){
        if(root == null) return;
        if(root.left == null && root.right == null){
            String s = temp + root.val;
            ans.add(s);
            return;
        }
        helper(root.left,temp+root.val+"->",ans);
        helper(root.right,temp+root.val+"->",ans);
    }
}
