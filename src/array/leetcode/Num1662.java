package array.leetcode;

public class Num1662 {
    public static void main(String[] args) {
        Num1662 num = new Num1662();
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        num.arrayStringsAreEqual(word1,word2);
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}
