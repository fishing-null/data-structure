package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num144 {
//    List<Integer> ret = new ArrayList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if(root == null){
//            return ret;
//        }
//        ret.add(root.val);
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
//        return ret;
//    }
    //非递归实现栈的前序遍历
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ret = new ArrayList<>();
            if(root == null){
                return ret;
            }
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode cur = stack.pop();
                ret.add(cur.val);
                //由于栈是LIFO的结构 所以先压入右子树
                if(cur.right!=null){
                    stack.push(cur.right);
                }
                //再压入左子树
                if(cur.left!=null){
                    stack.push(cur.left);
                }
            }
            return ret;
        }
}
