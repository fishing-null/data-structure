package offer;

import java.util.ArrayList;

public class Offer62 {
    public static void main(String[] args) {
        lastRemaining(5,3);
    }
    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int num = 0;
        while(n>1){
            num = (num+m-1)%n;
            list.remove(num);
            n--;
        }
        return list.get(0);
    }
}
