package offer;



public class Offer22 {
    //双指针法
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        ListNode low = head;
        while(fast != null){
            fast = fast.next;
            low = low.next;
        }
        return low;
    }
}
