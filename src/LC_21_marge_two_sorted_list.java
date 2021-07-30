
public class LC_21_marge_two_sorted_list {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        else if(l2==null) return l1;

        ListNode l3,last;
        // Initializing the l3 and last
        if(l1.val < l2.val){
            l3 = last = l1;
            l1 = l1.next;
            last.next = null;
        }else{
            l3 = last = l2;
            l2 = l2.next;
            last.next=null;
        }

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                last.next = l1;
                last = last.next;
                l1 = l1.next;
                last.next = null;
            }else{
                last.next = l2;
                last = last.next;
                l2 = l2.next;
                last.next = null;
            }
        }

        if(l1 != null){
            last.next = l1;
        }else{
            last.next = l2;
        }
        return l3;
    }
}
