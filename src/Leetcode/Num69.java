package Leetcode;

public class Num69 {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int left = 1;
        int right = x;
        int mid = 0;
        while(left <= right){
            mid = left + ((right-left)>>1);
            if(x/mid == mid) {
                return mid;
            }else if(x/mid < mid){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
