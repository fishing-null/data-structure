package Leetcode;

import java.util.*;

public class Num145 {
//    List<Integer> ret = new ArrayList<>();
//    public List<Integer> postorderTraversal(TreeNode root) {
//        if(root == null){
//            return ret;
//        }
//        postorderTraversal(root.left);
//        postorderTraversal(root.right);
//        ret.add(root.val);
//        return ret;
//    }
//      List<Integer> ret = new ArrayList<>();
//      public List<Integer> postorderTraversal(TreeNode root){
//          if(root == null){
//              return ret;
//          }
//          TreeNode cur = root;
//          //上一个完全处理过的节点(左右根都处理完毕的节点)
//          TreeNode prev = null;
//          Deque<TreeNode> queue = new LinkedList<>();
//          while(cur != null || !queue.isEmpty()){
//              while(cur != null){
//                  queue.push(cur);
//                  cur = cur.left;
//              }
//              //此时左树为空,cur取栈顶元素,第二次访问
//              cur = queue.pop();
//              //判断右树是否为空或者被我们访问过
//              if(cur.right == null || prev == cur.right){
//                  ret.add(cur.val);
//                  //当前节点cur就是最后处理的根节点,更新prev引用,变为cur
//                  prev = cur;
//                  cur = null;
//              }else{
//                  //此时右树不为空且没有处理过,就需要把根节点再压入栈中,处理右子树
//                  queue.push(cur);
//                  cur = cur.right;
//              }
//          }
//          return ret;
//      }
    List<Integer> ret = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root){
        if(root == null){
            return ret;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode cur = stack1.pop();
            if(cur != null){
                stack2.push(cur.val);
            }
            if(cur.left != null){
                stack1.push(cur.left);
            }
            if(cur.right != null){
                stack1.push(cur.right);
            }
        }
        while(!stack2.isEmpty()){
            ret.add(stack2.pop());
        }
        return ret;
    }
}
