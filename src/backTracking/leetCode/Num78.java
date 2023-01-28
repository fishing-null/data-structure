package backTracking.leetCode;

import java.util.*;

public class Num78 {
    public static void main(String[] args) {
        Num78 num78 = new Num78();
        num78.subsets(new int[] {1,2,3});

    }
    List<Integer> tmp = new ArrayList<>();
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracking(0,nums);
        return ret;
    }
    public void backTracking(int stareIndex,int[] nums){
        if(stareIndex == nums.length){
            ret.add(new ArrayList<>(tmp));
            return;
        }
        tmp.add(nums[stareIndex]);
        backTracking(stareIndex + 1,nums);
        tmp.remove(tmp.size()-1);
        backTracking(stareIndex + 1,nums);
    }
}
