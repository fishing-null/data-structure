package leetCode;

public class Num236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        //都找到了
        if(left != null && right != null){
            return root;
        }
        //只找到了p
        if(left != null){
            return left;
        }
        //只找到了q
        if(right != null){
            return right;
        }
        //都没找到
        return null;
    }
}
