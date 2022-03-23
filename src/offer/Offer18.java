package offer;



public class Offer18 {
    class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode node = dummyHead;
        while(node.next!=null){
            if(node.next.val == val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return dummyHead.next;
    }
}
}
