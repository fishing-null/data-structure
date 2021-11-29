package MyList;

public class SingleLinkedList {
    private int size;
    private Node head;
    //链表的头插法
    public void addFirst(int val){
        Node node = new Node(val);
        if(node == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }
    public String toString(){
        String ret = " ";
        //遍历链表，从头部遍历到尾部
        Node node = head;
        while(node != null){
            ret += node.val;
            ret +="->";
            node = node.next;
        }
        ret += "NULL";
        return ret;
    }

}
class Node{
    //存储具体数据
    int val;
    //存储下一个节点的地址
    Node next;
    public Node(int val){
        this.val = val;
    }

}



