package array.leetcode;

public class Num1991 {
    public static void main(String[] args) {
        Num1991 num1991 = new Num1991();
        num1991.findMiddleIndex(new int[] {2,3,-1,8,4});

    }
    public int findMiddleIndex(int[] nums) {
        int length = nums.length;
        int[] prefixSum = new int[length+1];
        int[] postfixSum = new int[length+1];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
        for (int i = postfixSum.length-2; i >= 0 ; i--) {
            postfixSum[i] = postfixSum[i+1] + nums[i];
        }
        for (int i = 1; i < length+1; i++) {
            if(prefixSum[i] == postfixSum[i-1]){
                return i-1;
            }
        }
        return -1;
    }
}
