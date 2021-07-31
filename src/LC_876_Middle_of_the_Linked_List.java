public class LC_876_Middle_of_the_Linked_List {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode middleNode(ListNode head) {
        int mid = countNodes(head)/2;
        for(int i=0;i<mid;i++){
            head = head.next;
        }
        return head;
    }

    public static int countNodes(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
