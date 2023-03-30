package array.leetcode;

import java.util.Arrays;

public class Num1637 {
    public static void main(String[] args) {
        Num1637 num1637 = new Num1637();
        int[][] points = new int[][] {{3,1},{9,0},{1,0},{1,5},{5,3},{8,8}};
        num1637.maxWidthOfVerticalArea(points);

    }
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = Integer.MIN_VALUE;
        int[] xPoints = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            xPoints[i] = points[i][0];
        }
        Arrays.sort(xPoints);
        for (int i = 0; i < xPoints.length-1; i++) {
            int tmp = xPoints[i+1] - xPoints[i];
            max = Math.max(max,tmp);
        }
        return max;
    }
}
