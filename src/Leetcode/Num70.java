package Leetcode;

public class Num70 {
    class Solution {
        public int climbStairs(int n) {
            //1.
//            if(n==1 || n==2){
//                return n;
//            }
//            int i1 = 1;
//            int i2 = 2;
//            for (int i = 3; i <=n; i++) {
//                int temp = i1+i2;
//                i1 = i2;
//                i2 = temp;
//            }
//            return i2;
            //2.递归法
            if(n==1 || n==2 ){
                return n;
            }
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }
}
