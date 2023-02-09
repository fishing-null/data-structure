package leetCode;

public class NumArray {
    int[] prefixSum;
    int length;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length+1];
        length = nums.length;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1]+nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right+1] - prefixSum[left];
    }
}
