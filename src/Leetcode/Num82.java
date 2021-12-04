package Leetcode;

public class Num82 {
    //移除链表中的重复元素,不保留唯一
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(101);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode cur = prev.next;
        if(dummyHead.next == null){
            return null;
        }
        while(cur != null){
            ListNode next = cur.next;
            if(next == null){
                return dummyHead.next;
            }else{
                if(cur.val != next.val) {
                    prev = prev.next;
                    cur = cur.next;
                }else{
                    while(next != null && cur.val == next.val){
                        next = next.next;
                    }
                    prev.next = next;
                    cur = next;
                    next = next.next;
                }

            }
        }
        return dummyHead.next;
    }
}
