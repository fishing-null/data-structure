package Leetcode;

public class Num2055 {
    public static void main(String[] args) {
        String s = "***|**|*****|**||**|*";
        int[][] p = {{1,17},{4,5},{14,17},{5,11},{15,16}};
        platesBetweenCandles(s,p);
    }
    public static int[] platesBetweenCandles(String s, int[][] queries) {
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ret[i] = candleCount(s.substring(queries[i][0],queries[i][1]+1));
        }
        return ret;
    }
    public static int candleCount(String s){
        char[] strings = s.toCharArray();
        int count = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i] == '|'){
                left = i;
                break;
            }
            left = -1;
        }
        for (int i = strings.length-1; i >=0 ; i--) {
            if(strings[i] == '|'){
                right = i;
                break;
            }
            right = -1;
        }
        if(left == -1 || right == -1 || left>=right){
            return 0;
        }
        for (int i = left; i < right; i++) {
            if(strings[i] == '*'){
                count++;
            }
        }
        return count;
    }
}
