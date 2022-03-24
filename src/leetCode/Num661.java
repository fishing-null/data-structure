package leetCode;

public class Num661 {
    public static void main(String[] args) {
        int[][] nums = {{100,200,100},{200,50,200},{100,200,100}};
        imageSmoother(nums);
    }
    public static int[][] imageSmoother(int[][] img) {
        int[][] copy = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                copy[i][j] = img[i][j];
            }
        }
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                copy[i][j] = imageSmootherHelper(img,i,j);
            }
        }
        return copy;
    }


    public static int imageSmootherHelper(int[][] img, int row, int cal){
        int sum = 0;
        int count = 0;
        if(row-1>=0 && cal-1>=0){
            sum += img[row-1][cal-1];
            count++;
        }
        if(row-1>=0 && cal+1<img[0].length){
            sum += img[row-1][cal+1];
            count++;
        }
        if(row-1 >= 0){
            sum += img[row-1][cal];
            count++;
        }
        if(row+1<img.length && cal-1 >= 0){
            sum += img[row+1][cal-1];
            count++;
        }
        if(row+1<img.length && cal+1 < img[0].length){
            sum += img[row+1][cal+1];
            count++;
        }
        if(row+1<img.length){
            sum += img[row+1][cal];
            count++;
        }
        if(cal-1>=0){
            sum += img[row][cal-1];
            count++;
        }
        if(cal+1 < img[0].length){
            sum += img[row][cal+1];
            count++;
        }
        sum += img[row][cal];
        count++;
        return sum/count;
    }
}
