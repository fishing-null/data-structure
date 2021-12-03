package Leetcode;

public class Num203 {
    public ListNode removeElements(ListNode head, int val) {
        //1.
//        while(head != null && head.val == val){
//            head=head.next;
//        }
//        if(head == null){
//            return null;
//        }else{
//            ListNode prev = head;
//            while(prev.next != null){
//                if(prev.next.val == val){
//                    ListNode cur = prev.next;
//                    prev.next = cur.next;
//                }else{
//                    prev = prev.next;
//                }
//            }
//        }
//        return head;
//    }
//        //2.虚拟头结点法
//        ListNode dummyHead = new ListNode(-1);
//        dummyHead.next = head;
//        ListNode prev = dummyHead;
//        while(prev.next != null){
//            if(prev.next.val == val){
//                prev.next = prev.next.next;
//            }else{
//                prev=prev.next;
//            }
//        }
//        return dummyHead.next;
//    }
        //3.递归法
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }
}
