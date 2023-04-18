package myBinTree.leetcode;

public class Num1026 {
    public static void main(String[] args) {

    }
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root,root.val,root.val);
    }
    public int dfs(TreeNode root,int min,int max){
        if(root == null){
            return 0;
        }
        int diff = Math.max(Math.abs(root.val-max),Math.abs(root.val-min));
        min = Math.min(min,root.val);
        max = Math.max(max,root.val);
        diff = Math.max(diff,dfs(root.left,min,max));
        diff = Math.max(diff,dfs(root.right,min,max));
        return diff;
    }
}
