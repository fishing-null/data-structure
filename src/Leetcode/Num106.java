package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Num106 {
    private int index;
    List<Integer> postorderList = new ArrayList<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder,postorder,0,postorder.length-1);
    }
    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int left, int right) {
        reverse(postorder);
        if(left>right){
            return null;
        }
        if(index == postorder.length){
            return null;
        }
        TreeNode root = new TreeNode(postorderList.get(index));
        index++;
        int pos = find(inorder, root.val);
        root.right = buildTreeHelper(inorder,postorder,pos+1,right);
        root.left = buildTreeHelper(inorder,postorder,left,pos-1);
        return root;
    }

    private int find(int[] inorder, int val) {
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == val){
                return i;
            }
        }
        return -1;
    }
    private void reverse(int[] postorder){
        for (int i = postorder.length-1; i >=0 ; i--) {
            postorderList.add(postorder[i]);
        }
    }
}
