package SeqLIst.DoubleLinkedList;

public class DoubleLinkedList {
    private int size;
    //头结点
    private Node head;
    //尾结点
    private Node tail;
    public void addFirst(int val){
        Node node = new Node(null,val,head);
        if(head == null){
            //当前链表为空
            tail = node;
        }else{
            head.prev = node;
        }
        head = node;
        size ++;
    }

    public void addLast(int val){
        Node node = new Node(tail,val,null);
        if(head == null){
            head = node;
        }else{
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void addIndex(int val,int index){
        if(index < 0 || index>size) {
            System.out.println("add index illegal!");
            return;
        }else if(index == 0){
            addFirst(val);
        }else if(index == size){
            addLast(val);
        }else{
            //在中间位置插入,找到index的前驱节点
            Node prev = node(index - 1);
            //连接节点
            Node newNode = new Node(prev,val,prev.next);
            prev.next.prev = newNode;
            prev.next = newNode;
            size++;
        }
    }

    private Node node(int index) {
        //index < size/2,从头开始找
        Node ret = null;
        if (index < (size >> 1)) {
            ret = head;
            for (int i = 0; i < index; i++) {
                ret = ret.next;
            }
        } else {
            ret = tail;
            for (int i = size-1; i > index; i--) {
                ret = ret.prev;
            }
        }
        return ret;
    }

    public String toString(){
        String ret = "";
        Node node = head;
        while(node != null){
            ret += node.val +"->";
            node = node.next;
        }
        ret += "NULL";
        return ret;
    }

    public int get(int index){
    if(rangeIndex(index)){
        return node(index).val;
    }else{
        System.out.println("get index illegal!");
        return -1;
    }
    }

    private boolean rangeIndex(int index) {
        if(index < 0 || index >= size){
            return false;
        }
        return true;
    }

    public boolean contains (int val){
        for(Node x = head;x != null;x=x.next){
            if(x.val == val){
                return true;
            }
        }
        return false;
    }

    public int set(int index,int newVal){
        if(rangeIndex(index)){
            Node node = node(index);
            int oldVal = node.val;
            node.val = newVal;
            return oldVal;
        }else{
            System.out.println("set index illegal");
            return -1;
        }
    }

    public void removeIndex(int index){
        if(rangeIndex(index)){
            Node node = node(index);
            unlink(node);
        }else{
            System.out.println("remove index illegal");
        }
    }

    public void removeFirse(int index){
        removeIndex(0);
    }

    public void removeLast(int last){
        removeIndex(size-1);
    }

    public void removeValueOnce(int val){
        for(Node x = head; x!=null;x=x.next){
            if(x.val == val){
                unlink(x);
                break;
            }
        }
    }

    public void removeValueAll(int val){
        for(Node x = head;x!=null;){
            if(x.val==val){
                Node next = x.next;
                unlink(x);
                x = next;
            }else{
                x=x.next;
            }
        }
    }

    //在双向链表中删除指定的node节点
    private void unlink(Node node){
        Node prev = node.prev;
        Node next = node.next;
        //处理前驱节点
        if(prev == null){
            head=head.next;
        }else{
            prev.next=next;
            node.prev=null;
        }
        if(next == null){
            tail=tail.prev;
        }else{
            next.prev=prev;
            node.next=null;
        }
        size--;
    }








    class Node {
        Node prev;
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node prev, int val, Node next) {
            this.prev = prev;
            this.val = val;
            this.next = next;
        }
    }


