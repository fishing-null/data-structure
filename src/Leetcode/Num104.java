package Leetcode;

public class Num104 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int rightHeight =  maxDepth(root.right);
        int leftHeight = maxDepth(root.left);
        int max = Math.max(leftHeight,rightHeight);
        return 1+max;
    }
}
