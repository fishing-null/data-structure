package dynamicProgramming.leetcode;

public class Num121 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int ret = 0;
        //纪录最小值的下标
        int minPriceIndex = 0;
        for(int i = 0; i < prices.length;i++){
            if(prices[i] <= prices[minPriceIndex]){
                //更新最小值下标
                minPriceIndex = i;
            }
            ret = Math.max(ret,prices[i] - prices[minPriceIndex]);
        }
        return ret;
    }
}
