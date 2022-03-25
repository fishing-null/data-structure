package seqList.leetcode;

import java.util.Arrays;

public class Num148 {
    public ListNode sortList(ListNode head) {
        ListNode list = head;
        int count = 0;
        while(list != null){
            list = list.next;
            count++;
        }
        int[] ret = new int[count];
        for (int i = 0; i < count; i++) {
            ret[i] = head.val;
            head = head.next;
        }
        Arrays.sort(ret);
        ListNode dummyHead = new ListNode(-1);
        ListNode list2 = dummyHead;
        for (int i = 0; i < count; i++) {
            ListNode cur = new ListNode(ret[i]);
            list2.next = cur;
            list = list.next;
        }
        return dummyHead.next;
    }
}
