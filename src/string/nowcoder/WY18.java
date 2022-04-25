package string.nowcoder;
import java.util.*;
public class WY18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = 0;
        for(int i = 0;i<=s1.length();i++){
            StringBuffer sb = new StringBuffer(s1);
            sb.insert(i,s2);
            StringBuffer tmp = new StringBuffer(sb);
            tmp.reverse();
            if(tmp.toString().equals(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
