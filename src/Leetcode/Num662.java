package Leetcode;

import java.util.Queue;

import java.util.LinkedList;

public class Num662 {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxWidth = 0;
        Queue<TreeNodeWithCount> queue = new LinkedList<>();
        queue.offer(new TreeNodeWithCount(root,1));
        while(!queue.isEmpty()){
            int levelWidth = 0;
            int size = queue.size();
            int L = 0;
            int R = 0;
            for (int i = 0; i < size; i++) {
                TreeNodeWithCount cur = queue.poll();
                if(i == 0){
                    L = cur.count;
                }
                if(i == size-1){
                    R = cur.count;
                }
                if(cur.node.left != null){
                    queue.offer(new TreeNodeWithCount(cur.node.left,cur.count*2));
                }
                if(cur.node.right != null){
                    queue.offer(new TreeNodeWithCount(cur.node.right,cur.count*2+1));
                }
            }
            levelWidth = R - L +1;
            maxWidth = Math.max(levelWidth,maxWidth);
        }
        return maxWidth;
    }
    public class TreeNodeWithCount{
        TreeNode node;
        int count;
        TreeNodeWithCount(TreeNode node,int count){
            this.node = node;
            this.count = count;
        }
    }
}
