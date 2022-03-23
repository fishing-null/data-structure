package leetCode;

public class Num504 {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        Boolean flag = false;
        if(num < 0){
            flag = true;
        }
        num = Math.abs(num);
        while(num != 0){
            sb.append(num % 7);
            num /= 7;
        }
        if(flag == true){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
