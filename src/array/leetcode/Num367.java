package array.leetcode;

public class Num367 {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        int left,right = num;
        left = 0;
        while (left <= right){
            int mid = (right - left)/2+left;
            long square = (long)mid*mid;
            if(num == square){
                return true;
            }else if(square < num){
                left = mid + 1;
            }else if(square > num){
                right = mid - 1;
            }
        }
        return false;
    }
}
