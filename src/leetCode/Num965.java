package leetCode;

public class Num965 {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        //注意短路运算 先判空
        if(root.left != null && root.val != root.left.val){
            return false;
        }
        if(root.right != null && root.val != root.right.val){
            return false;
        }
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}
