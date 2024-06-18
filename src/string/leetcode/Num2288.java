package string.leetcode;

public class Num2288 {
    public static void main(String[] args) {

    }
    public String discountPrices(String sentence, int discount) {
        //价格转换比列
        double priceRate = 1 - discount/10.0;
        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            if(check(sentenceArray[i])){
                sentenceArray[i] = String.format("$%.2f",Long.parseLong(sentenceArray[i].substring(1))*priceRate);
            }
        }
        return sentenceArray.toString();
    }

    private boolean check(String s) {
        if (s.length() == 1 || s.charAt(0) != '$') {
            return false;
        }
        char[] ch = s.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            if (!Character.isDigit(ch[i])) {
                return false;
            }
        }
        return true;
    }

}
