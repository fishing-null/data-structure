package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num441 {
        public int arrangeCoins(int n) {
            long l = 1, r = n;
            while (l < r) {
                long mid = l + r + 1 >> 1;
                if (mid * (mid + 1) / 2 <= n) l = mid;
                else r = mid - 1;
            }
            return (int)r;
        }
}
