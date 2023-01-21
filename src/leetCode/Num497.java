package leetCode;

import java.util.Random;

public class Num497 {
    public static void main(String[] args) {

    }
    Random random;
    int n;
    int[][] rect;
    public Num497(int[][] rects) {
        this.rect = rects;
         n = rects.length;
         random = new Random();
    }

    public int[] pick() {
        int sumSquare = 0;
        int flag = -1;
        for (int i = 0; i < n; i++) {
            int tmpSquare = (rect[i][2] - rect[i][0]+1)*(rect[i][3] - rect[i][1]+1);
            sumSquare += tmpSquare;
            if(random.nextInt(sumSquare) < tmpSquare){
                flag = i;
            }
        }
        int x = random.nextInt(rect[flag][2]-rect[flag][0]+1)+rect[flag][0];
        int y = random.nextInt(rect[flag][3]-rect[flag][1]+1)+rect[flag][1];
        return new int[] {x,y};
    }
}
