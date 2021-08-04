import java.util.HashMap;
import java.util.Map;

public class LC_1_two_sum {
    // brute force approach
    /*
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            boolean flag = false;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return result;
    }
     */


    // using HashMap
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i],i);

        for(int i=0;i<nums.length;i++){
            int cnum = nums[i];
            int remaining = target-cnum;
            if(map.containsKey(remaining) && map.get(remaining) != i){
                return new int[]{i,map.get(remaining)};
            }
        }
        return new int[2];
    }

}

