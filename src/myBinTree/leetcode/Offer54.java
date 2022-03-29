package myBinTree.leetcode;

import queue.Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Offer54 {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        kthLargestHelper(root,list);
        return list.get(list.size()-k);
    }
    public void kthLargestHelper(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left != null){
            kthLargestHelper(root.left,list);
        }
        list.add(root.val);
        if(root.right != null){
            kthLargestHelper(root.right,list);
        }
    }
}
