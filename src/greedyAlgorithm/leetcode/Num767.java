package greedyAlgorithm.leetcode;

public class Num767 {
    public String reorganizeString(String s) {
        int[] hash = new int[26];
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < s.length(); i++) {
            if(maxCount < ++hash[s.charAt(i) - 'a']){
                maxCount = hash[s.charAt(i) - 'a'];
                maxChar = s.charAt(i);
            }
        }
        int len = s.length();
        if(maxCount > (len + 1)/2) return "";
        char[] ret = new char[len];
        int index = 0;
        for (int i = 0; i < maxCount; i++) {
            ret[index] = maxChar;
            index += 2;
        }
        hash[maxChar - 'a' ] = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < hash[i]; j++) {
                if(index >= len)index = 1;
                ret[index] = (char) (i + 'a');
                index += 2;
            }
        }
        return new String(ret);
    }
}
