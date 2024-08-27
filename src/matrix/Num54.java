package matrix;

import java.util.ArrayList;
import java.util.List;

public class Num54 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Num54 num54 = new Num54();
        num54.spiralOrder(matrix);

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        //按一圈一圈打印
        int top = 0,left = 0,right = matrix[0].length - 1,bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            //打印(top,left) -> (top,right)
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            //打印(top+1,right) -> (bottom,right)
            for (int i = top + 1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if(left < right && top < bottom){
                //打印(bottom,right - 1) -> (bottom,left)
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                //打印(bottom - 1,left) -> (top + 1,left)
                for (int i = bottom - 1; i > top ; i--) {
                    res.add(matrix[i][left]);
                }
            }
            //缩小一圈
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }


}
