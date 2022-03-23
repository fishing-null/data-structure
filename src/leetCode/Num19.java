package leetCode;

public class Num19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(101);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode low = dummyHead;
        //找到第倒数n+1个节点
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            low = low.next;
        }
        low.next=low.next.next;
        return dummyHead.next;
    }
}
