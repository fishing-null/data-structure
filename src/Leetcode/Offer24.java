package Leetcode;
import java.util.Stack;

public class Offer24 {
//    public ListNode reverseList(ListNode head) {
//        ListNode dummyHead = new ListNode(-1);
//        while(head != null){
//            ListNode node = new ListNode(head.val);
//            node.next = dummyHead.next;
//            dummyHead.next = node;
//            head = head.next;
//        }
//        return dummyHead.next;
//    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode node = reverseList(head.next);
        //将链表的头结点 递归的放到链表最后一个节点
        head.next.next = head;
        head.next = null;
        return node;
    }

}
