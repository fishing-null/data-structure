package math.leetcode;

public class Num1041 {
    public static void main(String[] args) {

    }
    public boolean isRobotBounded(String instructions) {
        int[][] directions = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
        int x = 0;
        int y = 0;
        int direction = 0;
        for (int i = 0; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);
            if(instruction == 'G'){
                x += directions[direction][0];
                y += directions[direction][1];
            }else if(instruction == 'L'){
                direction += 3;
                direction %= 4;
            }else{
                direction++;
                direction %= 4;
            }
        }
        return direction != 0 || (x == 0 && y == 0);
    }
}
