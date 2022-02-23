package Leetcode;

public class Num101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirrorTree(root.left,root.right);
    }
    public boolean isMirrorTree(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && isMirrorTree(left.right,right.left) && isMirrorTree(left.left,right.right);
    }
}
