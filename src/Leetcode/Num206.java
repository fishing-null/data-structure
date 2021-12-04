package Leetcode;

public class Num206 {
    //1.原地移动法
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode next = cur.next;
        ListNode prev = null;
        if(head == null || head.next == null){
            return head;
        }
        while(cur != null){
            next = cur.next;//作为暂存节点,防止cur后的值丢失
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
