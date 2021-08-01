public class LC_53_Maximum_Subarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int csum = nums[0];
            int osum = nums[0];
            for(int i=1;i<nums.length;i++){
                if(csum + nums[i]> nums[i]){
                    csum += nums[i];
                }else{
                    csum = nums[i];
                }
                if(csum > osum){
                    osum = csum;
                }
            }
            return osum;
        }
    }
}
