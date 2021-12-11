package Leetcode;

public class Num142 {
    public ListNode detectCycle(ListNode head) {
        ListNode low = head, fast = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
            if (low == fast) {
                ListNode third = head;
                while (third != low) {
                    low = low.next;
                    third = third.next;
                }
                return low;
            }
        }
        return null;
    }
}
