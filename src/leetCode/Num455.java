package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Num455 {
    public static void main(String[] args) {

    }
    public  int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);Arrays.sort(s);
        int count = 0;
        for (int i = 0,j = 0; i < g.length && j < s.length; i++,j++) {
            while (j < s.length && g[i] > s[j]){
                j++;
            }
            if(j < s.length){
                count++;
            }
        }
        return count;
    }
}
