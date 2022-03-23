package seqList.leetcode;

public class Offer25 {
    //
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode last = dummyHead;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                last.next = l1;
                last = l1;
                l1 = l1.next;
            }else{
                last.next = l2;
                last = l2;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            last.next = l2;
        }
        if(l2 == null){
            last.next = l1;
        }
        return dummyHead.next;
    }
}
