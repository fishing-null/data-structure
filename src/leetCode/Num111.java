package leetCode;

public class Num111 {
    public static void main(String[] args) {

    }
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if(root.left != null){
            int leftLength = minDepth(root.left);
            min_depth = Math.min(leftLength,min_depth);
        }
        if(root.right != null){
            int rightLength =  minDepth(root.right);
            min_depth = Math.min(rightLength,min_depth);
        }
        return min_depth+1;
    }
}
