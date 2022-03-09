package Offer;


import java.util.Stack;

public class OfferII027 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode node = new ListNode();
        node = head;
        while(node != null){
            s.push(node.val);
            node = node.next;
        }
        while(head != null){
            if(s.pop() == head.val){
                head = head.next;
            }else{
                return false;
            }
        }
        return true;
    }
}
