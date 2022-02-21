package MyBiTree;

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
        // 边界条件
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        // 按照先序遍历的方式访问左树
        preOrder(root.left);
        // 按照先序遍历的方式访问右树
        preOrder(root.right);
    }
    //中序遍历
    public static void inOrder(TreeNode root){
        // 边界条件
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    //后序遍历
    public static void postOrder(TreeNode root){
        // 边界条件
        if(root == null){
            return;
        }
        // 按照后序遍历的方式访问左树
        postOrder(root.left);
        // 按照后序遍历的方式访问右树
        postOrder(root.right);
        System.out.print(root.val+" ");
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
}
