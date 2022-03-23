package leetCode;

public class Num105 {
    private int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bulidTreeHelper(preorder,inorder,0,preorder.length-1);
    }

    private TreeNode bulidTreeHelper(int[] preorder, int[] inorder, int left, int right) {
        if(left>right){
            return null;
        }
        if(index == preorder.length){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        index++;
        int pos = find(root.val,inorder);
        root.left = bulidTreeHelper(preorder,inorder,left,pos-1);
        root.right = bulidTreeHelper(preorder,inorder,pos+1,right);
        return root;
    }

    private int find(int val, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == val){
                return i;
            }
        }
        return -1;
    }
}
