package myBinTree.leetcode;

public class Lcr047 {
    public static void main(String[] args) {

    }
    public TreeNode pruneTree(TreeNode root) {
        return search(root);
    }
    public TreeNode search(TreeNode root){
        //递归的终止条件,当前节点为空,则返回空
        if(root == null) return null;
        root.left = search(root.left);
        root.right = search(root.right);
        //剪枝,若当前节点为叶子节点,并且val == 0,则可剪枝
        if(root.left == null && root.right == null && root.val == 0) root = null;
        return root;
    }
}
