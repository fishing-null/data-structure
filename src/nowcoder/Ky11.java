package nowcoder;
import java.util.Scanner;

public class Ky11 {
    private static int index = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //多组输入
        while(scanner.hasNext()){
            String str = scanner.next();
            //根据前序遍历的字符串 构建二叉树
            TreeNode root = preOrderbulid(str);
            //使用中序遍历输出节点值
            inOrder(root);
            System.out.println();
        }
    }

    private static void inOrder(TreeNode root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    private static TreeNode preOrderbulid(String str) {
        char cur = str.charAt(index);
        if(cur == '#'){
            //空节点 不构建节点
            return null;
        }
        TreeNode root = new TreeNode(cur);
        index++;
        //递归处理左子树
        root.left = preOrderbulid(str);
        index++;
        //递归处理右子树
        root.right = preOrderbulid(str);
        return root;
    }
    private static class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(char val) { this.val = val; }
        TreeNode(char val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
