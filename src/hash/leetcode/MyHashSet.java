package hash.leetcode;

public class MyHashSet {
    private class Node{
        int key;
        Node next;
        public Node(){}
        public Node(int key,Node next){
            this.key = key;
            this.next = next;
        }
    }
    public MyHashSet(){
        this(DEFAULT_CAPACITY);
    }
    public MyHashSet(int intiCap) {
        this.data = new Node[intiCap];
    }
    private static final int DEFAULT_CAPACITY = 100000;
    private Node[] data;
    private int hash(int key){
        return key%DEFAULT_CAPACITY;
    }
    public void add(int key) {
        int index = hash(key);
        if(!contains(key)){
            Node cur = data[index];
            if(cur == null){
                data[index] = new Node(key,null);
            }else{
                while(cur.next != null){
                    cur = cur.next;
                }
                cur.next = new Node(key,null);
            }
        }
    }
    public void remove(int key) {
        int index = hash(key);
        if(contains(key)){
            Node head = data[index];
            if(head.key == key){
                data[index] = head.next;
            }
            Node prev = head;
            while(prev.next != null){
                if(prev.next.key == key){
                    prev.next = prev.next.next;
                }
                prev = prev.next;
            }
        }else{
            return;
        }
    }
    public boolean contains(int key) {
        int index = hash(key);
        Node cur = data[index];
        while(cur != null){
            if(cur.key != key){
                cur = cur.next;
            }else{
                return true;
            }
        }
        return false;
    }
}
