package greedyAlgorithm.leetcode;

public class Num738 {
    public static void main(String[] args) {
        Num738 num738 = new Num738();
        num738.monotoneIncreasingDigits(668841);

    }
    public int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        int flag = s.length();
        char[] ch= s.toCharArray();
        for (int i = s.length()-2; i >= 0 ; i--) {
            if(ch[i] > ch[i+1]){
                ch[i]--;
                flag = i+1;
            }
        }
        for (int i = flag; i < ch.length; i++) {
            ch[i] = '9';
        }
        return Integer.parseInt(String.valueOf(ch));
    }
}
