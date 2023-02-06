package myBinTree.leetcode;

public class Num2331 {
    public static void main(String[] args) {

    }
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null){
            return root.val == 1;
        }
        if(root.val == 2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        }else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}
