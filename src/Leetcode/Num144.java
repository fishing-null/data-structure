package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num144 {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return ret;
        }
        ret.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return ret;
    }
}
