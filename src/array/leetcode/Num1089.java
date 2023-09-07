package array.leetcode;

public class Num1089 {
    public static void main(String[] args) {
        Num1089 num1089 = new Num1089();
        num1089.duplicateZeros(new int[] {0,1,7,6,0,2,0,7});

    }
    public void duplicateZeros(int[] arr) {
        int cur = 0,dest = -1;
        int len = arr.length;
        while (dest < len-1 ){
            if(arr[cur] == 0){
                dest += 2;
            }else {
                dest += 1;
            }
            if(dest >= len-1){
                break;
            }
            cur++;
        }
        if(dest == len){
            arr[dest - 1] = 0;
            dest -= 2;
            cur--;
        }
        while (cur >= 0 ){
            if(arr[cur] == 0){
                arr[dest] = 0;
                arr[dest-1] = 0;
                dest -= 2;
            }else{
                arr[dest] = arr[cur];
                dest--;
            }
            cur--;
        }
    }
}
