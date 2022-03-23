package leetCode;

public class Num106 {
    private int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postorder =  reverse(postorder);
        return buildTreeHelper(inorder,postorder,0,postorder.length-1);
    }
    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int left, int right) {
        if(left>right){
            return null;
        }
        if(index == postorder.length){
            return null;
        }
        TreeNode root = new TreeNode(postorder[index]);
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
    private int[] reverse(int[] postorder){
        int left = 0;
        int right = postorder.length-1;
        while(left<right){
            int temp = postorder[left];
            postorder[left] = postorder[right];
            postorder[right] = temp;
            left++;
            right--;
        }
        return postorder;
    }
}
