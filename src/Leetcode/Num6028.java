package Leetcode;

public class Num6028 {
    public static void main(String[] args) {
        String s = "SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR";
        countCollisions(s);
    }
    public static int countCollisions(String directions) {
        char[] ch = directions.toCharArray();
        int count = 0;
        for (int i = 0; i < directions.length()-1; i++) {
            if(ch[i] == 'R' && ch[i+1] == 'L'){
                count += 2;
                ch[i] = 'S';
                ch[i+1] = 'S';
                if(i>=1 && ch[i-1] == 'R'){
                    count++;
                }
            }
            if(ch[i] == 'R' && ch[i+1] == 'S' ){
                count += 1;
                ch[i] = 'S';
                if(i>=1 && ch[i-1] == 'R'){
                    count++;
                }
            }
            if(ch[i] == 'S' && ch[i+1] == 'L'){
                count += 1;
                ch[i+1] = 'S';
                if(i>=1 && ch[i-1] == 'R'){
                    count++;
                }
            }
        }
        return count;
    }
}
