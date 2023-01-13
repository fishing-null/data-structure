package array.leetcode;

public class Num283 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        if(nums.length == 1 && nums[0] == 0){
            return;
        }
        int low = 0,fast = 1;
        while(fast < nums.length){
            if(nums[low] == 0){
                if(nums[fast] != 0){
                    int tmp = nums[low];
                    nums[low] = nums[fast];
                    nums[fast] = tmp;
                    low++;
                }
                fast++;
            }else{
                low++;
                fast++;
            }
        }
    }
}
