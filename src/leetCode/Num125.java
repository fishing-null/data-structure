package leetCode;

import static java.lang.Character.isLetter;

public class Num125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ret = isPalindrome(s);
        System.out.println(ret);
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')){
                str.append(c);
            }
        }
        String ret = str.toString();
        int left = 0;
        int right = ret.length() - 1;
        while(left < right){
            if(ret.charAt(left) == ret.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
