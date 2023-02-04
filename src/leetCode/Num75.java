package leetCode;

public class Num75 {
    public static void main(String[] args) {
        Num75 num75 = new Num75();
        num75.sortColors(new int[] {0,0,1});

    }
    public void sortColors(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int left = 0,right = 1;
        while (left < nums.length && right < nums.length){
            if(nums[left] == 0){
                left++;
                right++;
                continue;
            }
            if(nums[right] == 0 && nums[left] != 0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
        right = left+1;
        while (left < nums.length && right < nums.length){
            if(nums[left] == 1){
                left++;
                right++;
                continue;
            }
            if(nums[right] == 1 && nums[left] == 2){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }
    private void swap(int[] nums,int num1,int num2){
        int tmp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = tmp;
    }
}
