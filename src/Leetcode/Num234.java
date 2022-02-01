package Leetcode;

import java.util.Stack;

public class Num234 {
    public boolean isPalindrome(ListNode head){
        //1.找中间节点+翻转链表
//        ListNode middleNode = middleNode(head);
//        ListNode l2 = reverseList(middleNode);
//        while(l2 != null && head != null){
//            if(head.val != l2.val){
//                return false;
//            }
//            l2 = l2.next;
//            head = head.next;
//        }
//        return true;
        //2.运用栈解决
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
    public ListNode middleNode(ListNode head) {
        //快慢指针
        ListNode fast = head;
        ListNode low = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }
    public ListNode reverseList(ListNode head) {
        //1.原地移动法
//        ListNode cur = head;
//        ListNode next = cur.next;
//        ListNode prev = null;
//        if(head == null || head.next == null){
//            return head;
//        }
//        while(cur != null){
//            next = cur.next;//作为暂存节点,防止cur后的值丢失
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
////        return prev;
//        //2.递归法
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode sec = head.next;
//        //翻转第二个节点之后的子链表
//        ListNode newHead = reverseList(head.next);
//        //将sec.next = head;
//        sec.next = head;
//        head.next = null;
//        return newHead;
          //3.头插法
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(5001);
        //边遍历原链表,边头插新链表
        while(head != null){
            ListNode node = new ListNode(head.val);
            node.next = dummyHead.next;
            dummyHead.next = node;
            head = head.next;
        }
        return dummyHead.next;
    }
}
