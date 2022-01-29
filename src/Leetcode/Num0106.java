package Leetcode;

public class Num0106 {
    public String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        if(S.length()==0){
            return S;
        }
        char last = S.charAt(0);
        int repeatCount = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == last) {
                repeatCount++;
            } else {
                sb.append(last).append(repeatCount);
                last = S.charAt(i);
                repeatCount = 1;
            }
        }
        sb.append(last).append(repeatCount);
        if((sb.toString().length())<S.length()){
            return sb.toString();
        }
        return S;
    }
}
