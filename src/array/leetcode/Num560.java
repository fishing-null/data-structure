package array.leetcode;

public class Num560 {
    public static void main(String[] args) {
        Num560 num560 = new Num560();
        num560.subarraySum(new int[] {1,1,1},2);

    }
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j >= 0 ; j--) {
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
