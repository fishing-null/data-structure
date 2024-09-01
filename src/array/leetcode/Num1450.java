package array.leetcode;

public class Num1450 {
    public static void main(String[] args) {

    }
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int length = startTime.length;
        int ret = 0;
        for(int i = 0; i < length ; i++){
            if(queryTime <= endTime[i] && queryTime >= startTime[i]) ret++;
        }
        return ret;
    }

}
