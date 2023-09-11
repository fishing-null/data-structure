package array.leetcode;

import java.util.HashSet;

public class Num246 {
    public static void main(String[] args) {
        Num246 num246 = new Num246();
        num246.isStrobogrammatic("6");

    }
    public boolean isStrobogrammatic(String num) {
        int[] nums = {0, 1, -1, -1, -1, -1, 9, -1, 8, 6};
        int left = 0,right = num.length()-1;
        while (left<=right){
            int a = num.charAt(left)-'0';
            int b = num.charAt(right)-'0';
            if(nums[num.charAt(left)-'0'] == num.charAt(right)-'0'){
                left++;
                right--;
            }else return false;
        }
        return true;
    }
}
