public class LC_367_Valid_Perfect_Square {
    class Solution {
        public boolean isPerfectSquare(int num) {
            long low = 1;
            long high = 100000;
            long mid;
            long sq;
            while(low <= high){
                mid = low + (high - low)/2;
                sq = mid*mid;
                if(sq == num) return true;
                else if(sq>num){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return false;
        }
    }
}
