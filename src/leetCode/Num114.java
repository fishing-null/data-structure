package leetCode;
import java.util.ArrayList;

import java.util.List;
public class Num114 {
    private List<Integer> ret = new ArrayList<>();
    public void flatten(TreeNode root) {
        //递归法
//        if(root == null){
//            return ;
//        }
//        flatten(root.left);
//        flatten(root.right);
//        TreeNode tmp = root.right;
//        root.right = root.left;
//        root.left = null;
//        while(root.right != null){
//            root = root.right;
//        }
//        root.right = tmp;
        if(root == null){
            return ;
        }
        preOrder(root);
        root.left = null;
        root.right = null;
        for (int i = 1; i < ret.size(); i++) {
            root.right = new TreeNode(ret.get(i));
            root = root.right;
        }
    }
    private void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        ret.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
