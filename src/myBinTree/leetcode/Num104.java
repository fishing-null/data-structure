package myBinTree.leetcode;

public class Num104 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
