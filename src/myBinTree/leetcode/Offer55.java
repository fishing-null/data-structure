package myBinTree.leetcode;

public class Offer55 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int nLeft = maxDepth(root.left);
        int nRight = maxDepth(root.right);
        return 1+Math.max(nLeft,nRight);
    }
}
