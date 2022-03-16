package Leetcode;

import java.util.Stack;

public class Num61 {
    public static void main(String[] args) {
        ListNode list = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        rotateRight(list,2);
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode node = head;
        Stack<ListNode> s1 = new Stack<>();
        while(node != null){
            ListNode cur = new ListNode(node.val);
            s1.push(cur);
            node = node.next;
        }
        k = k % s1.size();
        if(k == 0){
            return head;
        }
        Stack<ListNode> s2 = new Stack<>();
        for (int i = 0; i < k; i++) {
            s2.push(s1.pop());
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode ret = s2.pop();
        dummyHead.next = ret;
        while(!s2.isEmpty()){
            ListNode cur = s2.pop();
            ret.next = cur;
            ret = ret.next;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        while(!s2.isEmpty()){
            ListNode cur = s2.pop();
            ret.next = cur;
            ret = ret.next;
        }
        return dummyHead.next;
    }
}
