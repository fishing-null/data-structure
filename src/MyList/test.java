package MyList;

public class test {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(3);
        singleLinkedList.addFirst(5);
        singleLinkedList.addFirst(7);
        System.out.println(singleLinkedList);
        singleLinkedList.addLast(9);
        singleLinkedList.addIndex(2,3);
        System.out.println(singleLinkedList);
        singleLinkedList.removeValueOnce(3);
        System.out.println(singleLinkedList);
        singleLinkedList.removeIndex(1);
        System.out.println(singleLinkedList);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(3);
        System.out.println(singleLinkedList);
        singleLinkedList.removeAllValue(3);
        System.out.println(singleLinkedList);
    }
}
