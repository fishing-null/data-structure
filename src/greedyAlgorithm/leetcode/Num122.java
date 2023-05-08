package greedyAlgorithm.leetcode;

public class Num122 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
       int[] dayProfit = new int[prices.length-1];
        for (int i = 0; i < prices.length-1; i++) {
            dayProfit[i] = prices[i+1] - prices[i];
        }
        int totalProfit = 0;
        for (int i = 0; i < dayProfit.length; i++) {
            if(dayProfit[i] > 0){
                totalProfit += dayProfit[i];
            }
        }
        return totalProfit;
    }
}
