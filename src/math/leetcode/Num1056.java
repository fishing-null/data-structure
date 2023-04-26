package math.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num1056 {
    public static void main(String[] args) {
        Num1056 num1056 = new Num1056();
        num1056.confusingNumber(6);

    }
    public boolean confusingNumber(int n) {
        int[] is = new int[] {0,1,-1,-1,-1,-1,9,-1,8,6};
        int num = 0;
        for (int i = n; i > 0 ; i /= 10) {
            int tmp = i % 10;
            if(-1 == is[tmp]){
                return false;
            }
            num = num*10 + is[tmp];
        }

        return n != num;
    }
}
