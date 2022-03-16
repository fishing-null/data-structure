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
        root = add(root,val);
    }
    //新添加的元素一定作为叶子节点存在
    private TreeNode add(TreeNode root,int val){
        TreeNode node = new TreeNode(val);
        if(root == null){
            size ++;
            return node;
        }
        if(val < root.val){
            root.left = add(root.left,val);
        }
        if(val > root.val){
            root.right = add(root.right,val);
        }
        return root;
    }
    public boolean contains(int val){
        return contains(root,val);
    }
    private boolean contains(TreeNode root,int val){
        if(root == null) {
            return false;
        }
        if(root.val == val){
            return true;
        }
        if(val<root.val){
            return contains(root.left,val);
        }
        if(val> root.val){
            return contains(root.right,val);
        }
        return false;
    }
}
