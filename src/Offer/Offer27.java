package Offer;

public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        mirrorTreeHelper(root,root.left,root.right);
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
    private TreeNode mirrorTreeHelper(TreeNode root,TreeNode left,TreeNode right){
        TreeNode tmp = left;
        root.left = right;
        root.right = tmp;
        return root;
    }
}
