package greedyAlgorithm.leetcode;

public class Num942 {
    public static void main(String[] args) {

    }
    public int[] diStringMatch(String s) {
        int right = s.length();
        int left = 0;
        int len = s.length();
        int[] ret = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I'){
                ret[i] = left++;
            }else{
                ret[i] = right--;
            }
        }
        if(s.charAt(len-1) == 'I'){
            ret[len] = left++;
        }else{
            ret[len] = right--;
        }
        return ret;
    }
}
