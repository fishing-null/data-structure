package greedyAlgorithm.leetcode;

public class Num738 {
    public static void main(String[] args) {
        Num738 num738 = new Num738();
        num738.monotoneIncreasingDigits(332);

    }
    public int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        int flag = s.length();
        StringBuffer sb = new StringBuffer();
        char[] ch= s.toCharArray();
        for (int i = s.length()-1; i > 0 ; i--) {
            if(s.charAt(i-1) >= s.charAt(i)){
                ch[i-1] -= 1;
                flag = i;
            }
        }
        for (int i = flag; i < ch.length; i++) {
            ch[i] = '9';

        }
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        return Integer.valueOf(sb.toString());
    }
}
