package seqList.leetcode;

public class Num26 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int fast = 0;
        if(nums.length == 0 || nums == null)
        {
            return 0;
        }
        while(fast < nums.length)
        {
            if(nums[fast] == low){
                fast++;
            }else{
                low++;
                nums[low] = nums[fast];
            }
        }
        return low;
    }
}
