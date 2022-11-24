package myBinTree.leetcode;

public class Num572 {
    public static void main(String[] args) {

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(isSameTree(root,subRoot)||root==null){
            return true;
        }
        if(root == null){
            return false;
        }
        return isSubtree(root.left,subRoot.left) && isSubtree(root.right,subRoot.right);
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
