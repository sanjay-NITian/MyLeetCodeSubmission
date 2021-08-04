import java.util.ArrayList;
import java.util.List;

public class LC_78_Subsets {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            return helper(nums,0);
        }

        public List<List<Integer>> helper(int[] nums,int index){
            if(index == nums.length){
                List<List<Integer>> temp = new ArrayList<>();
                temp.add(new ArrayList<Integer>());
                return temp;
            }
            List<List<Integer>> rres = helper(nums,index+1);
            List<List<Integer>> res = new ArrayList<>(rres);
            for(List<Integer> l : rres){
                List<Integer> ll = new ArrayList<>(l);
                ll.add(nums[index]);
                res.add(ll);
            }
            return res;
        }
    }
}
