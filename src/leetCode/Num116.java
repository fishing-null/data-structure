package leetCode;

public class Num116 {
    public static void main(String[] args) {

    }
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        if(root.left != null){
            root.left.next = root.right;
            if(root.next != null){
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
