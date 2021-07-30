// Definition for singly-linked list.


public class LC_2_add_two_numbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = null;
        ListNode temp = result;
        while(l1!=null || l2!=null || carry!=0){
            int s=0;
            int last1=0,last2=0;
            if(l1 != null){
                last1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                last2 = l2.val;
                l2 = l2.next;
            }
            s = (last1 + last2 + carry)%10;
            carry = (last1 + last2 + carry)/10;
            if(result == null){
                result = new ListNode(s);
                temp = result;
            }else{
                temp.next = new ListNode(s);
                temp = temp.next;
            }

        }
        return result;
    }
}
