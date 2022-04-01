package myBinTree.leetcode;

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

    private void mirrorTreeHelper(TreeNode root,TreeNode left, TreeNode right) {
        TreeNode node = right;
        root.right = root.left;
        root.left = right;
    }
}
