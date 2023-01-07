package leetCode;

public class Num2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(7);
        addTwoNumbers(l1,l2);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(-1);
        ListNode head = dummyHead;
        while(l1 != null || l2 != null){
            int num1 = (l1 != null? l1.val : 0);
            int num2 = (l2 != null? l2.val : 0);
            int num = num1+num2+carry;
            dummyHead.next = new ListNode(num%10);
            dummyHead = dummyHead.next;
            carry = num/10;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry > 0){
            dummyHead.next = new ListNode(carry);
        }
        return head.next;
    }
}
