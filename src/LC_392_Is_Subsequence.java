public class LC_392_Is_Subsequence {
    // optimized approach O(n)
    public boolean isSubsequence(String s, String t) {
        int j=0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<t.length();i++){
            if(sb.length() == 0) break;
            if(t.charAt(i) == sb.charAt(0)){
                sb.deleteCharAt(0);
            }
        }
        if(sb.length() == 0) return true;
        else return false;
    }



    // This is one approach using recursion
    /*
    public boolean isSubsequence(String s, String t) {
        return helper(s,t,"");
    }

    public static boolean helper(String s,String t,String ans){
        if(t.length() == 0){
            // System.out.println(ans);
            if(ans.equals(s)){
                return true;
            }else{
                return false;
            }
        }
        char ch = t.charAt(0);
        String ros = t.substring(1);
        return helper(s,ros,ans + ch) || helper(s,ros,ans);
    }
    */
}
