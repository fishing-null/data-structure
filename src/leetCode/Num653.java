package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Num653 {
    public static void main(String[] args) {

    }
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        if(set.contains(k - root.val)){
            return true;
        }
        set.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}
