package array.leetcode;

public class Num1228 {
    public static void main(String[] args) {
        Num1228 num1228 = new Num1228();
        num1228.missingNumber(new int[] {0,0,0,0,0});

    }
    public int missingNumber(int[] arr) {
        int length = arr.length;
        int flag = (arr[length-1]-arr[0])/length;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < length-1; i++) {
            int tmp = arr[i+1]-arr[i];
            if(tmp != flag){
                index = i;
            }
        }
        return arr[index]+flag;
    }
}
