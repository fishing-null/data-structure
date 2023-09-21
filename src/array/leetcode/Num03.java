package array.leetcode;

import java.util.HashSet;

public class Num03 {
    public static void main(String[] args) {
        Num03 num03 = new Num03();
        num03.lengthOfLongestSubstring("au");

    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0||s.length()==1){
            return s.length();
        }
        int left=0,right=0,length=0;
        char[] ch = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()){
            char mark = ch[right];
            if(set.add(ch[right])){
                right++;
            }else{
                while (set.contains(mark)){
                    set.remove(ch[left]);
                    left++;
                }
            }
            length = Math.max(length,right-left);
        }
        return length;
    }
}
