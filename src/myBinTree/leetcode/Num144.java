package myBinTree.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num144 {
    private List<Integer> ret;
    public List<Integer> preorderTraversal(TreeNode root) {
        //迭代写法
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode cur = s.pop();
            ret.add(cur.val);
            if(cur.right != null){
                s.push(cur.right);
            }
            if(cur.left != null){
                s.push(cur.left);
            }
        }
        return ret;
    }
}
