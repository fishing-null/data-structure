package array.leetcode;

public class Num2303 {
    public static void main(String[] args) {
        int[][] brackets = new int[][] {{3,50},{7,10},{12,25}};
        calculateTax(brackets,10);

    }
    public static double calculateTax(int[][] brackets, int income) {
        int i = 0;
        double ret = 0;
        double flag = 0.01;
        while(income > 0){
            int dec = 0;
            if (i == 0){
                if(brackets[i][0] >= income){
                    ret += income*flag*brackets[i][1];
                    income = 0;
                }else{
                    ret += brackets[i][0]*flag*brackets[i][1];
                    income -= brackets[i][0];
                }
            }else{
                int tmp = brackets[i][0] - brackets[i-1][0];
                if(tmp >= income){
                    ret += income*flag*brackets[i][1];
                    income = 0;
                }else {
                    ret += tmp*flag*brackets[i][1];
                    income -= tmp;
                }
            }
            i++;
        }
        return ret;
    }
}
