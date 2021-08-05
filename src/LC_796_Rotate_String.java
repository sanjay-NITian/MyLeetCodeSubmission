import java.util.LinkedList;
import java.util.Queue;

public class LC_796_Rotate_String {
    public boolean rotateString(String s, String goal) {
        return helper(s,goal);

    }
    // This is approach 1
    // public static boolean helper(String s1,String s2){
    //     if(s1.length() != s2.length()){
    //         return false;
    //     }
    //     String temp = s1 + s1;
    //     if(temp.contains(s2)) return true;
    //     return false;
    // }


    // Approach 2 using 2 Qs
    public static boolean helper(String s1,String goal){
        if(s1.length() != goal.length()) return false;
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        for(int i=0;i<s1.length();i++) q1.add(s1.charAt(i));
        for(int i=0;i<goal.length();i++) q2.add(goal.charAt(i));
        int temp = q1.size();
        while(temp-- > 0){
            q2.add(q2.remove());
            if(isSameQ(q1,q2)){
                return true;
            }
        }
        return false;
    }
    public static boolean isSameQ(Queue<Character> q1, Queue<Character> q2){
        if(q1.size() != q2.size()) return false;
        Queue<Character> qq1 = new LinkedList<>(q1);
        Queue<Character> qq2 = new LinkedList<>(q2);
        while(qq1.size() != 0){
            if(qq1.remove() != qq2.remove()){
                return false;
            }
        }
        return true;

    }
}
