package greedyAlgorithm.leetcode;

public class Num860 {
    public static void main(String[] args) {
        int[] bills = new int[] {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        lemonadeChange(bills);

    }
    public static boolean lemonadeChange(int[] bills) {
        if(bills[0] == 10 || bills[0] == 20){
            return false;
        }
        int count5 = 0,count10 = 0;
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 5){
                count5++;
            }
            if(bills[i] == 10){
                count5--;
                count10++;
            }
            if(bills[i] == 20){
                if(count10 > 0){
                    count5--;
                    count10--;
                }else{
                    count5 -= 3;
                }
            }
            if(count5 < 0 || count10 < 0){
                return false;
            }
        }
        return true;
    }
}
