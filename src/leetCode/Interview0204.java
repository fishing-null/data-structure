package leetCode;

public class Interview0204 {
    //给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
    //
    //你不需要保留每个分区中各节点的初始相对位置。
    //
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(101);
        ListNode bigHead = new ListNode(101);
        ListNode smallTail = smallHead;
        ListNode bigTail = bigHead;
        while(head != null){
            if(head.val<x){
                smallTail.next = head;
                smallTail = head;
            }else{
                bigTail.next = head;
                bigTail = head;
            }
            head = head.next;
        }
        bigTail.next = null;
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}
