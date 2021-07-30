import java.util.ArrayList;
import java.util.List;

public class LC_1022_Sum_of_Root_To_Leaf_Binary_Numbers {
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


    public int sumRootToLeaf(TreeNode root) {
        int sum = 0;
        List<String> roots = helper(root);
        for(int i=0;i<roots.size();i++){
            sum += Integer.parseInt(roots.get(i),2);
        }
        // System.out.println(roots);
        return sum;
    }

    public static List<String> helper(TreeNode root){
        if(root == null){
            return new ArrayList<String>();
        }
        if(root.left == null && root.right==null){
            List<String> temp = new ArrayList<>();
            temp.add(String.valueOf(root.val));
            return temp;
        }
        List<String> leftans = helper(root.left);
        List<String> rightans = helper(root.right);
        List<String> ans = new ArrayList<>();
        for(String s : leftans){
            ans.add(""+root.val+s);
        }
        for(String s : rightans){
            ans.add(""+root.val+s);
        }
        return ans;
    }
}
