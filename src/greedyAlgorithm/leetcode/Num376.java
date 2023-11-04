package greedyAlgorithm.leetcode;

public class Num376 {
    public static void main(String[] args) {
        Num376 num376 = new Num376();
        num376.wiggleMaxLength(new int[] {1,7,4,9,2,5});
    }
    public int wiggleMaxLength(int[] nums) {
        int left = 0;
        int right = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            right = nums[i + 1] - nums[i];
            if(right == 0) continue;
            if(left * right <= 0) count++;
            left = right;
        }
        return count;
    }
}
