package nowcoder;

public class Cc142 {


    public class Solution {
        /**
         *
         * @param x int整型
         * @return int整型
         */
        public int reverse (int x) {
            // write code here
            long n=0;
            while (x!=0){
                n = n*10+x%10;
                x = x/10;
        }
            return (int)n==n?(int)n:0;
        }
    }
}
