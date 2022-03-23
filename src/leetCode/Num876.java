package leetCode;
//找到链表的中间节点
public class Num876 {
    public ListNode middleNode(ListNode head) {
        //快慢指针
        ListNode fast = head;
        ListNode low = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }
}
