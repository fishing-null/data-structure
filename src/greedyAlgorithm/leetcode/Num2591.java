package greedyAlgorithm.leetcode;

public class Num2591 {
    public static void main(String[] args) {

    }
    public int distMoney(int money, int children) {
        money -= children;
        int tmp = children*7;
        if(money < 0) return -1;
        if(money > children*7) return children-1;
        if(money == children*7) return children;
        if(money == children*7 - 4) return children-2;
        return money/7;
    }
}
