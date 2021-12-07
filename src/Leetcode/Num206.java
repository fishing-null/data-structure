package Leetcode;

public class Num206 {
    public ListNode reverseList(ListNode head) {
        //1.原地移动法
//        ListNode cur = head;
//        ListNode next = cur.next;
//        ListNode prev = null;
//        if(head == null || head.next == null){
//            return head;
//        }
//        while(cur != null){
//            next = cur.next;//作为暂存节点,防止cur后的值丢失
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
////        return prev;
//        //2.递归法
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode sec = head.next;
//        //翻转第二个节点之后的子链表
//        ListNode newHead = reverseList(head.next);
//        //将sec.next = head;
//        sec.next = head;
//        head.next = null;
//        return newHead;
        //3.头插法
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(5001);
        //边遍历原链表,边头插新链表
        while(head != null){
            ListNode node = new ListNode(head.val);
            node.next = dummyHead.next;
            dummyHead.next = node;
            head = head.next;
        }
        return dummyHead.next;
    }
}
