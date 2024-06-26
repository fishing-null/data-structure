package greedyAlgorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Num452 {
    public static void main(String[] args) {
        Num452 num452 = new Num452();

    }
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        if(points.length == 0){
            return 0;
        }
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if(points[i][0] > points[i-1][1]){
                count++;
            }else{
                points[i][1] = Math.min(points[i-1][1],points[i][1]);
            }
        }
        return count;
    }
}
