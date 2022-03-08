package Leetcode;

public class Offer06 {
    public int[] reversePrint(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        int count = 0;
        while(head != null){
            count += 1;
            ListNode node = new ListNode(head.val);
            node.next = dummyHead.next;
            dummyHead.next = node;
            head = head.next;
        }
        int[] ret = new int[count];
        dummyHead = dummyHead.next;
        for (int i = 0; i < count; i++) {
            ret[i] = dummyHead.val;
            dummyHead = dummyHead.next;
        }
        return ret;
    }
}
