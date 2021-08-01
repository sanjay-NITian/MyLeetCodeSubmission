public class LC_704_Binary_Search {
    public int search(int[] nums, int target) {
        return helper(nums,0,nums.length-1,target);
    }

    public static int helper(int[] nums,int start,int end,int target){
        if(start == end && nums[start] != target) return -1;
        int mid = (start + end)/2;
        if(target == nums[mid]) return mid;
        else if(target < nums[mid]){
            return helper(nums,start,end-1,target);
        }else{
            return helper(nums,start+1,end,target);
        }
    }
}
