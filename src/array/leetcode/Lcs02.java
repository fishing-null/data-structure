package array.leetcode;

import java.util.Arrays;

public class Lcs02 {
    public static void main(String[] args) {

    }
    public int halfQuestions(int[] questions) {
        int[] hash = new int[1001];
        int need = questions.length >> 1;
        for (int x:questions){
            hash[x]++;
        }
        int count = 0;
        Arrays.sort(hash);
        for (int i = 1000; i >= 0 ; i--) {
            if(need > 0){
                count++;
                need -= hash[i];
            }else {
                break;
            }
        }
        return count;
    }
}
