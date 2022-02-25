package Leetcode;

import java.util.*;

public class Num94 {
//    List<Integer> ret = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        if(root == null){
//            return ret;
//        }
//        inorderTraversal(root.left);
//        ret.add(root.val);
//        inorderTraversal(root.right);
//        return ret;
//    }
    List<Integer> ret = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        if(root == null){
            return ret;
        }
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ret.add(cur.val);
            cur = cur.right;
        }
        return ret;
    }
}
