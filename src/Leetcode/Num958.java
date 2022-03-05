package Leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Num958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //判断当前所处的状态
        boolean isSecondStep = false;
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(!isSecondStep){
                if(cur.left != null && cur.right != null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if(cur.left != null){
                    isSecondStep = true;
                    queue.offer(cur.left);
                }else if(cur.right != null){
                    return false;
                }else{
                    isSecondStep = true;
                }
            }else{
                if(cur.left != null || cur.right !=null){
                    return false;
                }
            }
        }
        return true;
    }
}
