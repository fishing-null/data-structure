package offer;

import java.util.Stack;

public class Offer0206 {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        Stack<Integer> s = new Stack<>();
        ListNode node = head;
        while(node != null){
            s.push(node.val);
            node = node.next;
        }
        while(head != null && !s.isEmpty()){
            if(s.pop() != head.val){
                return false;
            }
        }
        return true;
    }
}
