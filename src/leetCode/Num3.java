package leetCode;

import java.util.HashSet;

public class Num3 {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        int right = -1;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            //有重复，收缩窗口
            if(i != 0){
                set.remove(s.charAt(i-1));
            }
            //没有重复 扩张窗口
            while(right+1 < s.length()&& !set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            ret = Math.max(ret,right-i+1);
        }
        return ret;
    }
}
