package greedyAlgorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Num763 {
    public static void main(String[] args) {

    }
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i),i);
        }
        List<Integer> ret = new ArrayList<>();
        int right = 0;
        int last = -1;
        for (int i = 0; i < len; i++) {
            right = Math.max(right,map.get(s.charAt(i)));
            if(i == right){
                ret.add(i - last);
                last = i;
            }
        }
        return ret;
    }
}
