package backTracking.leetCode;

import java.util.ArrayList;
import java.util.List;

public class Num77 {
    public static void main(String[] args) {
        Num77 num77 = new Num77();
        num77.combine(3,2);

    }
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n,k,1);
        return ret;
    }
    public void backTracking(int n,int k,int startIndex){
        if(path.size() + (n - startIndex + 1) < k){
            return;
        }
        if(path.size() == k){
            ret.add(new ArrayList<>(path));
            return;
        }
        path.add(startIndex);
        backTracking(n,k,startIndex+1);
        path.remove(path.size()-1);
        backTracking(n,k,startIndex+1);
    }
}
