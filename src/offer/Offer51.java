package offer;

public class Offer51 {
    public int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    count++;
                }else{
                    continue;
                }
            }
        }
        return count;
    }
}
