package myBinTree.leetcode;

public class Num226 {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        inverse(root);
        return root;
    }
    public void inverse(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        inverse(node.left);
        inverse(node.right);
    }
}
