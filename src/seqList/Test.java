package seqList;

public class Test {
    public static void main(String[] args) {
        myArray2 array2 = new myArray2();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        array2.add(4);
        array2.add(5);
        array2.add(6);
        array2.add(2,3);
        array2.add(4,18);
        array2.add(8);
        array2.add(9);
        System.out.println(array2.isFull());
        System.out.println(array2.contains(8));
        System.out.println(array2.contains(10));
        System.out.println(array2.get(6));
        System.out.println(array2.get(10));
    }
}
