package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Num543 {
    Map<TreeNode,Integer> ret = new HashMap<>();
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        preOrder(root);
        int max = 0;
        for(int value:ret.values()){
            max = Math.max(max,value);
        }
        return max;
    }
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        ret.put(root,height(root.left)+height(root.right));
        preOrder(root.left);
        preOrder(root.right);
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}
