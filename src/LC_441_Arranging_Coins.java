public class LC_441_Arranging_Coins {
    class Solution {
        // This is one approach
    /*
    public int arrangeCoins(int n) {
        int count = 0;
        int i=1;
        while(n>=0){
            count++;
            n = n-i;
            i++;
        }
        return count -1;
    }
    */

        // TC O(1)  SC O(1)
        public int arrangeCoins(int n){
            return (int)(Math.sqrt(2*(long)n + 1/4.0) - 1/2.0);
        }
    }
}
