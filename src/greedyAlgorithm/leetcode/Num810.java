package greedyAlgorithm.leetcode;

public class Num810 {
    public static void main(String[] args) {

    }
    public boolean xorGame(int[] nums) {
        if(nums.length % 2 == 0){
            return true;
        }
        int xor = 0;
        for(int num:nums){
            xor ^= num;
        }
        return xor == 0;
    }
}
