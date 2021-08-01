import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_219_Contains_Duplicate_II {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.get(nums[i]).add(i);
                    List<Integer> list = map.get(nums[i]);
                    // System.out.println(map);
                    for(int j=1;j<list.size();j++){
                        if(Math.abs(list.get(j)-list.get(j-1)) <= k){
                            return true;
                        }
                    }

                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(nums[i],list);
                }
            }
            return false;
        }
    }
}
