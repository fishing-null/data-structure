package offer;

public class Offer21 {
    public int[] exchange(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            if(isOdd(nums[r]) && !isOdd(nums[l])){
                swap(nums,l,r);
                l++;
                r--;
            }
            if(isOdd(nums[r]) && isOdd(nums[l])){
                l++;
            }
            if(!isOdd(nums[r]) && !isOdd(nums[l])){
                r--;
            }
            if(!isOdd(nums[r]) && isOdd(nums[l])){
                l++;
                r--;
            }
        }
        return nums;
    }
    private void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
    private boolean isOdd(int num) {
        if(num%2 == 1){
            return true;
        }
        return false;
    }
}
