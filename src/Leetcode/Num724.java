package Leetcode;

public class Num724 {
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
    }
    public int pivotIndex(int[] nums) {
    int sum = 0;
    for(int i = 0;i<nums.length;i++){
        sum += nums[i];
    }
    int leftSum = 0;
    for(int i = 0;i<nums.length;i++){
        sum -= nums[i];
        if(leftSum == sum){
            return i;
        }
        leftSum += nums[i];

    }
    return -1;
}
}
