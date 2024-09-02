package myBinTree.leetcode;

public class Lcr049 {
    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int preSum){
        //拼接节点数字
        preSum = preSum * 10 + root.val;
        //是叶子节点,返回
        if(root.left == null && root.right == null) return preSum;
        int ret = 0;
        //不是叶子节点,继续向下拼接
        //拼接左节点
        if(root.left != null){
            ret += dfs(root.left,preSum);
        }
        //拼接右节点
        if(root.right != null){
            ret += dfs(root.right,preSum);
        }
        return ret;
    }
}
