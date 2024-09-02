package glideWindow;

public class Num2024 {
    public static void main(String[] args) {
        Num2024 n=new Num2024();
        n.maxConsecutiveAnswers("TTFF",2);
    }
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(func(answerKey,k,'T'),func(answerKey,k,'F'));
    }
    public int func(String answerKey,int k,Character ch){
        int left = 0,right = 0;
        int n = answerKey.length();
        int count = 0;
        int ret = Integer.MIN_VALUE;
        while (left < n && right < n) {
            //进窗口
            count += answerKey.charAt(right) == ch ? 0 : 1;
            while (count > k){
                //出窗口
                count -= answerKey.charAt(left++) == ch ? 0 : 1;
            }
            ret = Math.max(ret,right - left + 1);
            right++;
        }
        return ret;
    }
}
