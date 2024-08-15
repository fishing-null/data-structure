package dynamicProgramming.nowcoder;

public class BM63 {
    public static void main(String[] args) {

    }
    public int jumpFloor (int number) {
        // write code here
        if(number == 1 || number == 2) return number;
        return jumpFloor(number - 1) + jumpFloor(number - 2);
    }
}
