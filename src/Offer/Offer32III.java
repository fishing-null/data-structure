package Offer;

import java.util.*;

public class Offer32III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> curList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                curList.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            if(reverse){
                Collections.reverse(curList);
            }
            reverse = !reverse;
            ret.add(curList);
        }
        return ret;
    }
}
