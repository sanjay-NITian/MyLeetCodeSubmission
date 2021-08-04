import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_901_Online_Stock_Span {
    class StockSpanner {

        public List<Integer> nums;
        public Stack<Integer> st;
        public StockSpanner() {
            nums = new ArrayList<>();
            st = new Stack<>(); // will contain the index
        }

        public int next(int price) {
            int span = 1;
            nums.add(price);
            int i=nums.size()-1;
            while(!st.empty() && nums.get(i) >= nums.get(st.peek())){
                st.pop();
            }
            if(!st.empty()){
                span = i-st.peek();
            }else{
                span = i+1;
            }
            st.push(i);
            return span;
        }
    }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}
