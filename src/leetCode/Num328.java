package leetCode;

import java.util.Random;

public class Num328 {
    public static void main(String[] args) {

    }
    ListNode head;
    Random random;

    public Num328(ListNode head) {
        this.head = head;
        random = new Random();
    }
    public int getRandom() {
        int i = 1,ret = 0;
        ListNode node = head;
        while (node != null){
            if(random.nextInt(i) == 0){
                ret = node.val;
            }
            i++;
            node = node.next;
        }
        return ret;
    }
}
