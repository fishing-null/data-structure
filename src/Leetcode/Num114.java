package Leetcode;

public class Num114 {
    public void flatten(TreeNode root) {
        if(root == null){
            return ;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;
        while(root.right != null){
            root = root.right;
        }
        root.right = tmp;
    }
}
