package Leetcode;

public class num83 {
    //双指针+引用
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(101);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode cur = prev.next;
        while(cur != null){
            if(prev.val == cur.val){
                prev.next = cur.next;
            }else{
                prev = prev.next;
            }
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
