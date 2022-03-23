package leetCode;

public class Num141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
            if(fast == low){
                return true;
            }
        }
        //出循环 走到了null
        return false;
    }
}
