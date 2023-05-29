package array.leetcode;

public class Num2574 {
    public static void main(String[] args) {
        Num2574 num2574 = new Num2574();
        num2574.leftRightDifference(new int[] {10,4,8,3});

    }
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] prefixSum = new int[len];
        int[] suffixSum = new int[len];
        for (int i = 1; i < len; i++) {
            prefixSum[i] += prefixSum[i-1] + nums[i-1];
        }
        for (int i = len-1; i > 0; i--) {
            suffixSum[i-1] = nums[i] + suffixSum[i];
        }
        for (int i = 0; i < len; i++) {
            prefixSum[i] = Math.abs(prefixSum[i]-suffixSum[i]);
        }
        return prefixSum;
    }
}
