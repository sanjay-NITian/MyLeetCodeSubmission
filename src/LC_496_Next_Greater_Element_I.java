import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC_496_Next_Greater_Element_I {
    class Solution {

        // approach is from right to left
    /*
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            int x = nums2[i];
            while(!st.empty() && st.peek()<=x){
                st.pop();
            }
            if(st.empty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
    */

        // approach is from left to right
        public int[] nextGreaterElement(int[] nums1,int[] nums2){
            int[] result = new int[nums1.length];
            Map<Integer,Integer> map = new HashMap<>();
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for(int i=1;i<nums2.length;i++){
                while(!st.empty() && nums2[i]>nums2[st.peek()]){
                    map.put(nums2[st.pop()],nums2[i]);
                }
                st.push(i);
            }
            while(!st.empty()){
                map.put(nums2[st.pop()],-1);
            }
            for(int i=0;i<result.length;i++){
                result[i] = map.get(nums1[i]);
            }
            return result;
        }
    }
}
