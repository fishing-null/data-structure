package math.leetcode;
public class Num504 {
    public static void main(String[] args) {

    }
    public String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer();
        if(num == 0){
            return "0";
        }
        boolean flag = num<0;
        num = Math.abs(num);
        while(num != 0){
            sb.append(num%7);
            num /= 7;
        }
        if(flag){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
