package binary.nowcoder;

public class BM21 {
    public static void main(String[] args) {
        BM21 bm21 = new BM21();
        bm21.minNumberInRotateArray(new int[] {2,2,2,1,2});
    }
    public int minNumberInRotateArray (int[] nums) {
        // write code here
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else if(nums[mid] == nums[right]){
                right = right - 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
