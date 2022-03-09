package Offer;

import java.util.HashMap;
import java.util.Map;

public class Offer35 {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        //复制原链表
        while(cur != null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        //更改value的指向
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
