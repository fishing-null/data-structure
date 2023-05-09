package greedyAlgorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Num253 {
    public static void main(String[] args) {

    }
    public int minMeetingRooms(int[][] intervals) {
        int length = intervals.length;
        int[] starts = new int[length];
        int[] ends = new int[length];
        for (int i = 0; i < length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);Arrays.sort(ends);
        int i = 0,j = 0;
        int curPassenger = 0;
        int maxCount = 0;
        while(i < length && j < length){
            if(starts[i] < ends[j]){
                curPassenger++;
                i++;
            }else {
                curPassenger--;
                j++;
            }
            maxCount = Math.max(maxCount,curPassenger);
        }
        return maxCount;
    }
}
