package hash.leetcode;

import java.util.HashMap;

public class Num2661 {
    public static void main(String[] args) {
        Num2661 num2661 = new Num2661();
        num2661.firstCompleteIndex(new int[] {1,4,5,2,6,3}, new int[][] {{4,3,5},{1,2,6}});

    }
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,Integer[]> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                map.put(mat[i][j],new Integer[] {i,j});
            }
        }
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for (int i = 0; i < arr.length; i++) {
            Integer[] tmp = map.get(arr[i]);
            int x = tmp[0];
            int y = tmp[1];
            if(++row[x] == mat[0].length || ++col[y] == mat.length){
                return i;
            }
        }
        return -1;
    }
}
