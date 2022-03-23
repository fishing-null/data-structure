package myBinTree;

import java.util.*;

public class MyBinTree {
    private static class TreeNode{
        char val;
        TreeNode left;
        TreeNode right;
        public TreeNode(char val){
            this.val = val;
        }
    }
    public static TreeNode build(){
        TreeNode nodeA = new TreeNode('A');
        TreeNode nodeB = new TreeNode('B');
        TreeNode nodeC = new TreeNode('C');
        TreeNode nodeD = new TreeNode('D');
        TreeNode nodeE = new TreeNode('E');
        TreeNode nodeF = new TreeNode('F');
        TreeNode nodeG = new TreeNode('G');
        TreeNode nodeH = new TreeNode('H');
        nodeA.left = nodeB;
        nodeA.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeE.right = nodeH;
        nodeC.left = nodeF;
        nodeC.right = nodeG;
        return nodeA;
    }
    //先序遍历
    public static void preOrder(TreeNode root){
//        // 边界条件
//        if(root == null){
//            return;
//        }
//        System.out.print(root.val+" ");
//        // 按照先序遍历的方式访问左树
//        preOrder(root.left);
//        // 按照先序遍历的方式访问右树
//        preOrder(root.right);
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
            if(root.right != null){
                stack.push(root.left);
            }
            if(root.left != null){
                stack.push(root.right);
            }
        }
    }
    //中序遍历
    public static void inOrder(TreeNode root){
//        // 边界条件
//        if(root == null){
//            return;
//        }
//        inOrder(root.left);
//        System.out.print(root.val+" ");
//        inOrder(root.right);
        if(root == null){
            return;
        }
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            System.out.println(stack.pop());
            cur = cur.right;
        }
    }
    //后序遍历
    public static void postOrder(TreeNode root){
//        // 边界条件
//        if(root == null){
//            return;
//        }
//        // 按照后序遍历的方式访问左树
//        postOrder(root.left);
//        // 按照后序遍历的方式访问右树
//        postOrder(root.right);
//        System.out.print(root.val+" ");
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode cur = stack1.pop();
            while(cur!=null){
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
            System.out.println(stack2.pop());
        }
    }
    public static int getNode(TreeNode root){
        //统计二叉树节点个数
        //边界条件 当前节点为空
        if(root == null){
            return 0;
        }
        //当前节点不为空 则+1 遍历左子树和右子树
        return 1+getNode(root.left)+getNode(root.right);
    }
    public static int getLeafNode(TreeNode root){
        //统计二叉树叶子节点个数
        if(root == null){
            return 0;
        }
        //判断 当前节点的左子树和右子树为空 当前节点是叶子节点
        if(root.left == null && root.right == null){
            return 1;
        }
        //当前节点不是叶子节点 判断其左子树和右子树
        return getLeafNode(root.left)+getLeafNode(root.right);
    }
    public static boolean contains(TreeNode root,int val){
        //判断二叉树中是否包含某一个值
        if(root == null){
            return false;
        }
        if(root.val == val){
            return true;
        }
        return contains(root.left,val)||contains(root.right,val);
    }
    public static int height(TreeNode root){
        //判断一棵二叉树的高度
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int max = Math.max(leftHeight,rightHeight);
        return 1+max;
    }
    public static int getKLevelNodes(TreeNode root,int k){
        //求出以root为根节点的第k层根节点个数
        if(root == null || k<=0){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        //二叉树不为空 且k值>=2
        //以root为根节点的第k层 == 以root.left为根节点的k-1层+以root.right为根节点的k-1层
        return getKLevelNodes(root.left,k-1)+getKLevelNodes(root.right,k-1);
    }
    public static List<List<Character>> levelOrder(TreeNode root){
        List<List<Character>> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        //借助队列来实现遍历过程
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Character> curList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                curList.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            ret.add(curList);
        }
        return ret;
    }
    public static void main(String[] args) {
        TreeNode root = build();
        System.out.println("当前二叉树一共有:"+getNode(root)+"个节点数");
        System.out.println("当前二叉树一共有:"+getLeafNode(root)+"个叶子节点数");
    }
}
