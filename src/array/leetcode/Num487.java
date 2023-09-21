package array.leetcode;

public class Num487 {
    public static void main(String[] args) {

    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0,len = 0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j] == 0 && count < 1){
                    count++;
                    len++;
                }else if(nums[j] == 1){
                    len++;
                }else{
                    break;
                }
                ret = Math.max(ret,len);
            }
        }
        return ret;
    }
}
