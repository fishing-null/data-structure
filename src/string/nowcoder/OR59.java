package string.nowcoder;

import java.util.Scanner;

public class OR59 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String cur ="";
        String ret ="";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch<='9' && ch>='0'){
                cur = cur+ch+"";
            }else{
                if(cur.length()>ret.length()){
                    ret = cur;
                    cur = "";
                }else{
                    cur = "";
                }
            }
        }
        if(cur.length()>ret.length()){
            ret = cur;
        }
        System.out.println(ret);
    }
}
