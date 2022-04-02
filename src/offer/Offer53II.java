package offer;

public class Offer53II {
    public int missingNumber(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == i){
//                continue;
//            }else{
//                return i;
//            }
//        }
//        return nums.length;
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
