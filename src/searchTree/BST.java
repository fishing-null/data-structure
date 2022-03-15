package searchTree;

public class BST {
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int val;
        public TreeNode(int val){
            this.val = val;
        }
    }
    private int size;
    private TreeNode root;
    public void add(int val){
        add(root,val);
    }
    private TreeNode add(TreeNode root,int val){
        if(root == null){
            return root;
        }
        if(val<root.left.val){
            add(root.left,val);
        }
        if(val>root.right.val){
            add(root.right,val);
        }
        return root;
    }
}
