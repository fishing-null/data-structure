package greedyAlgorithm.leetcode;

public class Num1423 {
    public static void main(String[] args) {
        Num1423 num1423 = new Num1423();
        num1423.maxScore(new int[] {9,7,7,9,7,7,9},7);

    }
    public int maxScore(int[] cardPoints, int k) {
        int s = 0;
        int len = cardPoints.length;
        for (int i = 0; i < k; i++) {
            s += cardPoints[i];
        }
        int ret = s;
        for (int i = 1; i <= k; i++) {
            s += cardPoints[len - i] - cardPoints[k - i];
            ret = Math.max(s,ret);
        }
        return ret;
    }
}
