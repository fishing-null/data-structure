package Leetcode;

public class Num21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummyHead = new ListNode(101);
        ListNode last = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                last.next = list1;
                last = list1;
                list1 = list1.next;
            }else {
                last.next = list2;
                last = list2;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            last.next = list2;
        }
        if(list2 == null){
            last.next = list1;
        }
        return dummyHead.next;
    }
}
