package leetCode;

public class Num70 {
    class Solution {
        public int climbStairs(int n) {

            if(n==1 || n==2){
                return n;
            }
            int i1 = 1;
            int i2 = 2;
            for (int i = 3; i <=n; i++) {
                int temp = i1+i2;
                i1 = i2;
                i2 = temp;
            }
           return i2;
        }
    }
}
