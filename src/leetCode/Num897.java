package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Num897 {
    private List<Integer> ret = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        TreeNode dummyNode = new TreeNode(-1);
        TreeNode curNode = dummyNode.right;
        for (int i = 0; i < ret.size(); i++) {
            curNode.right = new TreeNode(ret.get(i));
            curNode = curNode.right;
        }
        return dummyNode.right;
    }
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        ret.add(root.val);
        inOrder(root.right);
    }
}
