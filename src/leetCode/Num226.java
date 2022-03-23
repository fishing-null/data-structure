package leetCode;

public class Num226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        swap(root,root.left,root.right);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    private void swap(TreeNode root,TreeNode left,TreeNode right){
        TreeNode node = left;
        root.left = right;
        root.right = left;
    }
}
