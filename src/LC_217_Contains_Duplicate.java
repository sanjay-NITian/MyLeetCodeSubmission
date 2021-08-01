import java.util.HashMap;
import java.util.Map;

public class LC_217_Contains_Duplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            map.put(nums[0],nums[0]);
            for(int i =1;i<nums.length;i++){
                if(map.containsKey(nums[i])) return true;
                map.put(nums[i],nums[i]);
            }
            return false;
        }
    }
}
