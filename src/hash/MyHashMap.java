package hash;


import java.util.NoSuchElementException;

public class MyHashMap {
    private class Node{
        int key;
        int val;
        Node next;
        public Node(int key,int val,Node next){
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    //当前哈希表中实际存储元素个数
    private int size;
    //默认哈希表长度
    private static final int DEFAULT_CAPACITY = 16;
    //默认负载因子
    private static final double LOAD_FACTOR = 0.75;
    //用于取得key值得索引
    private int M;
    private Node[] data;
    public MyHashMap(){
        this(DEFAULT_CAPACITY);
    }
    public MyHashMap(int intiCap) {
        this.data = new Node[intiCap];
        this.M = intiCap;
    }
    public int hash(int key){
        return Math.abs(key)%M;
    }
    public int add(int key,int val){
        int index = hash(key);
        for(Node x = data[index];x != null;x = x.next){
            if(x.key == key){
                int OldVal = x.val;
                x.val = val;
                return OldVal;
            }
        }
        Node node = new Node(key,val,data[index]);
        data[index] = node;
        size++;
        //检查是否扩容
        if(data.length * LOAD_FACTOR <= size){
            resize();
        }
        return val;
    }
    public boolean containsKey(int key){
        int index = hash(key);
        for(Node x = data[index];x != null; x = x.next){
            if(x.key == key){
                return true;
            }
        }
        return false;
    }
    public boolean containsValue(int val){
        for (int i = 0; i < data.length; i++) {
            for(Node x = data[i];x != null;x = x.next){
                if(x.val == val){
                    return true;
                }
            }
        }
        return false;
    }

    public int remove(int key){
        int index = hash(key);
        Node head = data[index];
        //判断头结点是否是待删除节点
        if(head.key == key){
            int val = head.val;
            data[index] = head.next;
            head.next = head = null;
            size--;
            return val;
        }
        //头结点不是待删除节点
        Node prev = head;
        while(prev.next != null){
            if(prev.next.key == key){
                Node cur = prev.next;
                int val = cur.val;
                prev.next = cur.next;
                cur.next = cur = null;
                size --;
                return val;
            }
            prev = prev.next;
        }
        throw new NoSuchElementException("no such key!remove error!");
    }
    private void resize() {
        Node[] newData = new Node[data.length << 1];
        this.M = newData.length;
        for (int i = 0; i < data.length; i++) {
            if(data[i] != null){
                for(Node x = data[i];x != null;){
                    Node next = x.next;
                    int newIndex = hash(x.key);
                    x.next = newData[newIndex];
                    newData[newIndex] = x;
                    x = next;
                }
            }else{
                continue;
            }
        }
        data = newData;
    }
}
