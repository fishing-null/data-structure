package myList;

public class SingleLinkedListWithHead {
    private int size;
    //虚拟头节点
    private Node dummyHead = new Node(-1);

    //添加方法
    public void addIndex(int index,int val){
        //判断index的合法性
        if(index < 0 || index>size){
            System.out.println("输入错误,请重新输入");
            return;
        }
        //插入全都是中间节点
        Node node = new Node(val);
        //找到待插入位置的前驱
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public String toString(){
        String ret = "";
        Node node = dummyHead.next;
        while(node != null){
            ret += node.val;
            ret += "->";
            node = node.next;
        }
        ret += "NULL";
        return ret;
    }
}
