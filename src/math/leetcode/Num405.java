package math.leetcode;

public class Num405 {
    public static void main(String[] args) {
        Num405 num405 = new Num405();
        num405.toHex(26);

    }
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 7; i >= 0; i--) {
            int val = (num >> (i*4)) & 0xf;
            if(!(sb.length() == 0 && val == 0)){
                char c = val <= 9 ? (char) ('0'+val):(char) ('a'+val-10);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
