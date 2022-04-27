package math.nowcoder;

import java.util.Scanner;

public class WY16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] data = new int[w][h];
        int count = 0;
        for(int i = 0;i < w;i++){
            for(int j = 0 ;j < h;j++){
                if(data[i][j] == 0){
                    count++;
                }
                if(i+2<w){
                    data[i+2][j] = 1;
                }
                if(j+2<h){
                    data[i][j+2] = 1;
                }
            }
        }
        System.out.println(count);
    }
}
