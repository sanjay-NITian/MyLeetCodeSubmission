import java.util.Stack;

public class LC_84_Largest_Rectangle_in_Histogram {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            Stack<Integer> st = new Stack<>();
            int[] nse = new int[heights.length];    // next smaller index
            int[] pse = new int[heights.length];    // previous smaller index

            // Code for the next smaller element
            for(int i=heights.length-1;i>=0;i--){
                int cnum = heights[i];
                while(!st.empty() && cnum<=heights[st.peek()]){
                    st.pop();
                }
                if(!st.empty()){
                    nse[i] = st.peek();
                }else{
                    nse[i] = heights.length;
                }
                st.push(i);
            }
            st.clear();

            // Code for the previous smaller element
            for(int i=0;i<heights.length;i++){
                int cnum = heights[i];
                while(!st.empty() && cnum <= heights[st.peek()]){
                    st.pop();
                }
                if(!st.empty()){
                    pse[i] = st.peek();
                }else {
                    pse[i] = -1;
                }
                st.push(i);
            }

            int maxArea = 0;
            for(int i=0;i<heights.length;i++){
                int width = nse[i] - pse[i] -1;
                int area = heights[i]*width;
                if(area>maxArea){
                    maxArea = area;
                }
            }

            // for(int i=0;i<nse.length;i++){
            //     System.out.printf("%d ",pse[i]);
            // }
            // System.out.println();
            // for(int i=0;i<nse.length;i++){
            //     System.out.printf("%d ",nse[i]);
            // }
            return maxArea;
        }
    }
}
