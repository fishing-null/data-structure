package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Num5268 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        List<Integer> ret1 = new ArrayList<>();
        for(int i:set1){
            if(!set2.contains(i)){
                ret1.add(i);
            }
        }
        List<Integer> ret2 = new ArrayList<>();
        for(int i:set2){
            if(!set1.contains(i)){
                ret2.add(i);
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(ret1);
        ret.add(ret2);
        return ret;
    }
}
