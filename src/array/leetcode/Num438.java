package array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num438 {
    public static void main(String[] args) {
        Num438 num438 = new Num438();
        num438.findAnagrams("zaa","aa");

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret = new ArrayList<>();
        int length = p.length();
        int[] hash = new int[26];
        for (int i = 0; i < length; i++) {
            int index = p.charAt(i) - 'a';
            hash[index] += 1;
        }
        int[] hash2 = new int[26];
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        for(int left = 0,right = 0,count = 0;right < s.length();right++){
            char in = ss[right];
            if(++hash2[in - 'a'] <= hash[in -'a']) count++;
            if(right - left + 1 > length){
                char out = ss[left++];
                if(hash2[out - 'a']-- <= hash[out - 'a']) count--;
            }
            if(count == length) ret.add(left);
        }
        return ret;
    }
}
