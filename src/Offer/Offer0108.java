package Offer;

import java.util.*;

public class Offer0108 {
    private Set<Integer> row = new HashSet<>();
    private Set<Integer> col = new HashSet<>();
    public void main(String[] args) {
        int[][] data = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(data);
    }
    public void setZeroes(int[][] matrix) {
        get(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(row.contains(i)){
                    matrix[i][j] = 0;
                }
        }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            if(col.contains(j)){
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public void get(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
    }
}
