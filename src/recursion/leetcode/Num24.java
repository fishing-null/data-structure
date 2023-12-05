package recursion.leetcode;

public class Num24 {
    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tmp = swapPairs(head.next.next);
        ListNode ret = head.next;
        ret.next = head;
        head.next = tmp;
        return ret;
    }

}
