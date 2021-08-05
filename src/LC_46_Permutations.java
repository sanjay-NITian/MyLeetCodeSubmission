import java.util.ArrayList;
import java.util.List;

public class LC_46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ques = new ArrayList<>();
        for(int num : nums) ques.add(num);
        helper(ques,new ArrayList<Integer>(),list);
        return list;
    }
    public static void helper(List<Integer> ques,List<Integer> ans,List<List<Integer>> t){
        if(ques.size() == 0){
            List<Integer> list = new ArrayList<>(ans);
            t.add(list);
            return;
        }
        for(int i=0;i<ques.size();i++){
            int curr = ques.get(i);
            ans.add(curr);
            List<Integer> roq = new ArrayList<>(ques);
            roq.remove(i);
            helper(roq,ans,t);
            ans.remove(ans.size()-1);  // undo the changes
        }
    }
}
