package array.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Num2951 {
    public static void main(String[] args) {

    }

    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ret = new LinkedList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]) ret.add(i);
        }
        return ret;
    }
}

