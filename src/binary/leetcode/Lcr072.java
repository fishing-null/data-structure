package binary.leetcode;

public class Lcr072 {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        if(x < 1) return 0;
        long left = 0,right = x;
        while (left < right){
            long mid = left + (right - left) / 2;
            if(Math.pow(mid,2) < x){
                left = mid + 1;
            }else if(Math.pow(mid,2) >= x){
                right = mid;
            }
        }
        return (int)right;
    }
}
