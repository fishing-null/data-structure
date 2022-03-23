package myBinTree.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num94 {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        if(root == null){
            return ret;
        }
        inorderTraversalHelper(root);
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
