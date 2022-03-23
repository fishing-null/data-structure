package offer;

public class Offer53II {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == i){
                continue;
            }else{
                return i;
            }
        }
        return nums.length;
    }
}
