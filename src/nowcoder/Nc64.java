package nowcoder;

public class Nc64 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        TreeNode leftHead = Convert(pRootOfTree.left);
        TreeNode leftTail = leftHead;
        //拼接左子树和根节点成为链表
        while(leftTail!=null && leftTail.right != null){
            leftTail = leftTail.right;
        }
        if(leftTail != null){
            pRootOfTree.left = leftTail;
            leftTail.right = pRootOfTree;
        }
        TreeNode rightHead = Convert(pRootOfTree.right);
        if(rightHead !=null){
            pRootOfTree.right = rightHead;
            rightHead.left = pRootOfTree;
        }
        if(leftHead == null){
            return pRootOfTree;
        }
        return leftHead;
    }
}
