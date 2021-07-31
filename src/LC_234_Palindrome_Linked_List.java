import java.util.Stack;

public class LC_234_Palindrome_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        int n = countNodes(head);
        int mid = n/2;
        Stack<Integer> st = new Stack<>();
        int i=0;
        while(head != null){
            if(n%2 == 0){
                if(i<mid){
                    st.push(head.val);
                }else {
                    if(st.pop() != head.val) return false;
                }
            }else{
                if(i<mid){
                    st.push(head.val);
                }else if(i>mid){
                    if(st.pop() != head.val) return false;
                }
            }
            head = head.next;
            i++;
        }
        return true;

    }

    public static int countNodes(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}
