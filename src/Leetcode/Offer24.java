package Leetcode;
import java.util.Stack;

public class Offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        while(head != null){
            ListNode node = new ListNode(head.val);
            node.next = dummyHead.next;
            dummyHead.next = node;
            head = head.next;
        }
        return dummyHead.next;
    }
}
