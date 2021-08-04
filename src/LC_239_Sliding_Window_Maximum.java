import java.util.Stack;

public class LC_239_Sliding_Window_Maximum {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] nge = new int[nums.length];
            int[] result = new int[nums.length-k+1];
            Stack<Integer> st = new Stack<>();
            // now finding the next greater element to the right
            st.push(0);
            for(int i=0;i<nums.length;i++){
                while(!st.empty() && nums[st.peek()]<=nums[i]){
                    nge[st.pop()] = i;
                }
                st.push(i);
            }
            while(!st.empty()){
                nge[st.pop()] = nums.length;
            }


            int j=0;
            for(int i=0;i<nums.length-k+1;i++){
                if(j<i){
                    j = i;
                }
                while(nge[j]<i+k){
                    j = nge[j];
                }
                result[i]=nums[j];
            }
            return result;
        }
    }
}
