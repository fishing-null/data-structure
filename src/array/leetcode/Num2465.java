package array.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Num2465 {
    public static void main(String[] args) {
        Num2465 num2465 = new Num2465();
        num2465.distinctAverages(new int[] {4,1,4,0,3,5});

    }
    public int distinctAverages(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int left = 0,right = nums.length-1;
        while(left < right){
            int avg = (nums[left] + nums[right]);
            left++;
            right--;
            set.add(avg);
        }
        return set.size();
    }
}
