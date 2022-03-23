package leetCode;
import static java.lang.Character.isLetter;
public class Num917 {
    class Solution {
        public String reverseOnlyLetters(String s) {
            char[] ch = s.toCharArray();
            int left = 0;
            int right = s.length()-1;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                //左右指针,碰到除字母以外的字符不动,碰到字母 左字符朝右走 右字符朝左走
                while(left<right){
                    if(isLetter(ch[left]) && isLetter(ch[right])){
                        char tmp = ch[left];
                        ch[left] = ch[right];
                        ch[right] = tmp;
                        left++;
                        right--;
                    }
                    if(!isLetter(ch[left])){
                        left++;
                    }
                    if(!isLetter(ch[right])){
                        right--;
                    }
                }
            }
            for (int i = 0; i < s.length(); i++) {
                sb.append(ch[i]);
            }
            return sb.toString();
        }
    }
}
