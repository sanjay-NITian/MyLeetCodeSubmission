public class LC_83_Remove_Duplicates_from_Sorted_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode i,j;
        i=j=head;
        while(j!=null){
            while(j!=null && j.val == i.val) j=j.next;
            if(j==null){
                i.next = null;
            }else{
                i.next = j;
                i=i.next;
            }
        }
        return head;
    }
}
