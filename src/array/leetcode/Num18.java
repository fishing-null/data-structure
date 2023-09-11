package array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num18 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i-1] == nums[i]){
                continue;
            }
            for (int j = i+1; j < len; j++) {
                if (j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int left = j + 1,right = len - 1;
                long aim = (long)target - nums[i] - nums[j];
                while (left < right){
                    long sum = (long)nums[left] + nums[right];
                    if(sum > aim) right--;
                    else if (sum < aim) left++;
                    else {
                        ret.add(Arrays.asList(nums[i],nums[j],nums[left++],nums[right--]));
                        while (left < right && nums[left-1] == nums[left]){
                            left++;
                        }
                        while (left < right && nums[right+1] == nums[right]){
                            right--;
                        }
                    }
                }
            }
        }
        return ret;
    }
}
