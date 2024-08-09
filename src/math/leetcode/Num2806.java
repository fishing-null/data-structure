package math.leetcode;

public class Num2806 {
    public static void main(String[] args) {
        Num2806 num2806 = new Num2806();
        num2806.accountBalanceAfterPurchase(15);
    }
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        //记录实际的开销
        int realPurchase = 0;
        double rate = (double)purchaseAmount / 10;
        //四舍五入 找最靠近的10
        rate = Math.round(rate);
        //实际开销 = 愿意支出的金额*比例
        realPurchase = 10*(int)rate;
        return 100-realPurchase;
    }
}
