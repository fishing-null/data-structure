package prefix;

public class Num1422 {
    public static void main(String[] args) {
        Num1422 num1422 = new Num1422();
        num1422.maxScore("00");

    }
    public int maxScore(String s) {
        int length = s.length();
        int[] countZero = new int[length];
        int[] countOne = new int[length];
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if(i == 0) countZero[i] = s.charAt(i) == '0' ? 1 : 0;
            else {
                if(s.charAt(i) == '0') countZero[i] = countZero[i - 1] + 1;
                else countZero[i] = countZero[i - 1];
            }
        }
        //反转字符串
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) countOne[i] = s.charAt(i) == '1' ? 1 : 0;
            else {
                if (s.charAt(i) == '1') countOne[i] = countOne[i - 1] + 1;
                else countOne[i] = countOne[i - 1];
            }
        }
        for (int i = 0; i <= length - 2; i++) {
            ret = Math.max(ret, countZero[i] + countOne[length - i - 2]);
        }
        return ret;
    }
}
