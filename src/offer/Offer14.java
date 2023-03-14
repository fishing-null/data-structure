package offer;

public class Offer14 {
    public static void main(String[] args) {
        Offer14 offer14 = new Offer14();
        offer14.cuttingRope(5);

    }
    public int cuttingRope(int n) {
//        int[] dp = new int[n+1];
//        dp[0] = 0;
//        dp[1] = 0;
//        for (int i = 2; i < n+1; i++) {
//            int max = 0;
//            for (int j = 0; j < i; j++) {
//                max = Math.max(max,Math.max(j*(i-j),j*dp[i-j]));
//            }
//            dp[i] = max;
//        }
//        return dp[n];
        //2.
        if(n < 2){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;dp[1] = 1;dp[2] = 2;dp[3] = 3;
        int max = 0;
        for (int i = 4; i <= n ; i++) {
            max = 0;
            for (int j = 0; j <= i/2 ; j++) {
                int product = dp[j]*dp[i-j];
                if(max < product){
                    max = product;
                }
                dp[i] = max;
            }
        }
        max = dp[n];
        return max;
}
}
