package dynamicProgramming.leetcode;

public class Lcr188 {
    public static void main(String[] args) {

    }
    public int bestTiming(int[] prices) {
        int ret = 0;
        int minPriceIndex = 0;
        for(int i = 0; i < prices.length;i++){
            if(prices[i] <= prices[minPriceIndex]){
                //更新最小下标
                minPriceIndex = i;
            }
            ret = Math.max(ret,prices[i] - prices[minPriceIndex]);
        }
        return ret;
    }
}
