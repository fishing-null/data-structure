package leetCode;

import java.util.Random;

public class Num398 {
    public static void main(String[] args) {

    }
    int[] nums;
    Random random;
    public Num398(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int pick(int target) {
        int ret = 0;
        for (int i = 0,count = 0; i < nums.length; i++) {
            if(nums[i] == target){
                ++count;
                if(random.nextInt(count) == 0){
                    ret = i;
                }
            }
        }
        return ret;
    }
}
