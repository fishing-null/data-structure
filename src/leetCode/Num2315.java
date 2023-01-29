package leetCode;

public class Num2315 {
    public static void main(String[] args) {

    }
    public int countAsterisks(String s) {
        boolean flag = true;
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '|'){
                flag = !flag;
            }else if(c == '*' && flag){
                ret++;
            }
        }
        return ret;
    }
}
