package greedyAlgorithm.leetcode;

public class Num860 {
    public static void main(String[] args) {

    }
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] == 10 || bills[0] == 20) return false;
        //创建数组存储零钱个数
        int[] money = new int[3];
        //遍历bills,能成功遍历到最后返回true,否则返回false
        for(int i = 0;i < bills.length;i++){
            //判断零钱类型
            if(bills[i] == 5){
                money[0] += 1;
            }else if(bills[i] == 10){
                money[1] += 1;
                money[0] -= 1;
            }else{
                //零钱为20的情况,优先使用10+5的方式进行找零,不行则使用5+5+5的方式
                if(money[1] >= 1 && money[0] >= 1){
                    money[1] -= 1;
                    money[0] -= 1;
                }else{
                    money[0] -= 3;
                }

            }
            //对零钱数量进行检查
            if(!checkMoney(money)) return false;
        }
        return true;
    }
    private boolean checkMoney(int[] money){
        for(int i = 0;i < money.length;i++){
            if(money[i] < 0){
                return false;
            }
        }
        return true;
    }
}
