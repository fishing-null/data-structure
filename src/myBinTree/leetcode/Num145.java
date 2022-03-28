package myBinTree.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num145 {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root){
        if(root == null){
            return ret;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode cur = stack1.pop();
            if(cur != null){
                stack2.push(cur.val);
            }
            if(cur.left != null){
                stack1.push(cur.left);
            }
            if(cur.right != null){
                stack1.push(cur.right);
            }
        }
        while(!stack2.isEmpty()){
            ret.add(stack2.pop());
        }
        return ret;
    }
}
