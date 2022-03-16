package searchTree;

public class BSTTest {
    public static void main(String[] args) {
        int[] data = {6,4,8,9,3,7,5};
        BST bst = new BST();
        for(int i:data){
            bst.add(i);
        }
        System.out.println(bst.contains(15));
    }
}
