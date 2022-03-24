package seqList.leetcode;

public class Offer06 {
    public int[] reversePrint(ListNode head) {
        ListNode list = head;
        int count = 0;
        while(list != null){
            list = list.next;
            count++;
        }
        int[] ret = new int[count];
        for (int i = ret.length-1;i >= 0; i--) {
            ret[i] = head.val;
            head = head.next;
        }
        return ret;
    }
}
