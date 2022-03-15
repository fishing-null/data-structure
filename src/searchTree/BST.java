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
}
