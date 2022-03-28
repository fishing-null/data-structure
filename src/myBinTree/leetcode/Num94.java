package myBinTree.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num94 {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
//        if(root == null){
//            return ret;
//        }
//        inorderTraversalHelper(root);
//        return ret;
        //迭代写法
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !s.isEmpty()){
            if(cur != null){
                s.push(cur);
                cur = cur.left;
            }else{
                cur = s.pop();
                ret.add(cur.val);
                cur = cur.right;
            }
        }
        return ret;
    }
    public void inorderTraversalHelper(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraversalHelper(root.left);
        ret.add(root.val);
        inorderTraversalHelper(root.right);
    }
}
