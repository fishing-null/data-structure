package Leetcode;

public class Num606 {
    private StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        if(root == null){
            return "";
        }
        //访问根节点
        sb.append(root.val);
        if(root.left != null){
            sb.append("(");
            tree2str(root.left);
            sb.append(")");
        }else{
            //左树为空 判断右树
            if(root.right != null){
                //右树不为空 添加()占位
                sb.append("()");
            }
            //左右树都为空 不进行操作
        }
        if(root.right != null){
            sb.append("(");
            tree2str(root.right);
            sb.append(")");
        }
        return sb.toString();
    }
}
