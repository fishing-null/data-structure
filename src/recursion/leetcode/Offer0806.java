package recursion.leetcode;

import java.util.List;

public class Offer0806 {
    public static void main(String[] args) {

    }
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        dfs(A,B,C,A.size());
    }

    private void dfs(List<Integer> a, List<Integer> b, List<Integer> c, int size) {
        if(size == 1){
            c.add(a.remove(a.size()-1));
            return;
        }
        dfs(a,c,b,size - 1);
        c.add(a.remove(a.size()-1));
        dfs(b,a,c,size - 1);
    }
}
