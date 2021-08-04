import java.util.ArrayList;
import java.util.List;

public class LC_113_Path_Sum_II {
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


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,targetSum,new ArrayList<Integer>(),ans);
        return ans;
    }
    public static void helper(TreeNode root,int targetSum,List<Integer> temp,List<List<Integer>> ans){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && targetSum-root.val == 0){
            List<Integer> t = new ArrayList<>(temp);
            t.add(root.val);
            ans.add(t);
            return;
        }
        temp.add(root.val);
        helper(root.left,targetSum-root.val,temp,ans);
        helper(root.right,targetSum-root.val,temp,ans);
        temp.remove(temp.size()-1);
    }
}
