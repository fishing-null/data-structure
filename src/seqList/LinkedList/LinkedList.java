package seqList.LinkedList;

public class LinkedList {
    public Node head;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index >size()){
            throw new IndexOutOfBoundsException("illegal index");
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        Node prev = findPrevNodeByIndex(index);
        Node node = new Node(data);
        node.next = prev.next;
        prev.next = node;
    }
    private Node findPrevNodeByIndex(int index) {
        // 定义一个临时变量，用来遍历
        Node current = head;
        for (int i = 0; i < (index - 1); i++) {
            current = current.next;
        }
        return current;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if(head == null){
            return false;
        }
        Node current = head;
        while(current.next != null){
            if(current.value == key){
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(head == null){
            return;
        }
        if(head.value == key){
            head = head.next;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.value == key){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if(head == null){
            return;
        }
        Node prevNode = head;
        Node current = head.next;
        while(current != null){
            if(current.value == key){
                prevNode.next = current.next;
            }else{
                prevNode = current;
            }
            current = current.next;
        }
        if(head.value == key){
            head = head.next;
        }
    }
    //得到单链表的长度
    public int size(){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void display(){
        Node current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (current != null) {
            sb.append(current.value);
            // 最后一个节点的时候我们不加逗号
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
    public void clear(){
        head = null;
    }
}
