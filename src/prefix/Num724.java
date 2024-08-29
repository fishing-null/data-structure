package prefix;

public class Num724 {
    public static void main(String[] args) {

    }
    public int pivotIndex(int[] nums) {
        int numsLength  = nums.length;
        int[] prefixSum = new int[numsLength];
        int[] suffixSum = new int[numsLength];
        prefixSum[0] = 0;
        suffixSum[numsLength - 1] = 0;
        for (int i = 1; i < numsLength; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        for (int i = numsLength - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < numsLength; i++) {
            if(prefixSum[i] == suffixSum[i]) return i;
        }
        return -1;
    }
}
