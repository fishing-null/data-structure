package hash.Nowcoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class OR63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            set.add(s2.charAt(i));
        }
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < s1.length(); i++) {
            if(set.contains(s1.charAt(i))){
                continue;
            }else{
                ret.append(s1.charAt(i));
            }
        }
        System.out.println(ret.toString());
    }
}
