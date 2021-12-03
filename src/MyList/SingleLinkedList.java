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
    //链表中间位置插入
    public void addIndex(int index,int val){
        if(index<0 || index >size){
            System.out.println("输入错误,请重新输入");
            return;
        }
        Node node = new Node(val);
        Node prev = head;
        if(index == 0){
            addFirst(val);
            return;
        }else{
            //找到待插入位置的前驱节点,当待插入位置是1时,前驱节点是0,就是头结点
            for (int i = 0; i < index-1; i++) {
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }
    public void addLast(int val){
        addIndex(size,val);
    }
    //根据用户输入的index查找对应值
    public int get(int index){
        if(rangeCheck(index)){
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node.val;
        }else{
            System.out.println("输入错误,请重新输入!");
            return -1;
        }
    }
    //将单链表中索引为idnex的节点值改为newVal并返回修改前的值
    public int set(int index,int newVal){
        if(rangeCheck(index)){
            Node node = head;
            for (int i = 0; i < size; i++) {
                node = node.next;
            }
            int oldVal = node.val;
            node.val = newVal;
            return oldVal;
        }else{
            System.out.println("输入错误,请重新输入");
            return -1;
        }
    }
    //链表的删除功能
    public void removeIndex(int index){
        if(rangeCheck(index)){
            if(index == 0){
                head = head.next;
                size--;
            }else{
                Node prev = head;
                for (int i = 0; i < index-1; i++) {
                    prev = prev.next;
                }
                prev.next = prev.next.next;
                size--;
            }
        }else{
            System.out.println("输入错误,请重新输入!");
            return;
        }
    }


    //删除链表中指定元素一次
    public void removeValueOnce(int val){
        if(head != null && head.val == val){
            head=head.next;
            size--;
        }else{
            Node prev = head;
            while(prev.next != null){
                if(prev.next.val == val){
                    prev.next = prev.next.next;
                    size--;
                    return;
                }else{
                    prev = prev.next;
                }
            }
        }
    }
    //删除链表中所有重复元素
    public void removeAllValue(int val){
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return ;
        }else{
            Node prev = head;
            while(prev.next != null){
                if(prev.next.val == val){
                    prev.next = prev.next.next;
                    size--;
                }else{
                    prev=prev.next;
                }
            }
        }
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
    private boolean rangeCheck(int index){
        if(index < 0 || index >=size) {
            return false;
        }else{
            return true;
        }
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



