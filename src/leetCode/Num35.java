package leetCode;

public class Num35 {
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = 2;
        searchInsert(nums,target);
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                right = mid-1;
            }else if(target > nums[mid]){
                left = mid+1;
            }
        }
        return left;
    }
}
