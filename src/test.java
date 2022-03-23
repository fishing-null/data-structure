import seqList.MyArray;

public class test {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        myArray.addLast(1);
        myArray.addLast(2);
        myArray.addLast(3);
        System.out.println(myArray.toString());
        myArray.addIndex(1,4);
        System.out.println(myArray.toString());
        myArray.removeIndex(1);
        System.out.println(myArray.toString());
        myArray.addLast(2);
        myArray.addLast(2);
        myArray.addLast(2);
        System.out.println(myArray.toString());
        myArray.removeAllValue(2);
        System.out.println(myArray.toString());
        System.out.println(myArray.contains(3));
        System.out.println(myArray.get(3));
        System.out.println(myArray.get(1));
        System.out.println(myArray.getbyValue(3));
    }

}
