package string.nowcoder;

public class JZ67 {
    public static int StrToInt(String str) {
        if(str == null || str.isEmpty()){
            return 0;
        }
        char[] ch = str.toCharArray();
        int flag = 1;
        if(ch[0] == '+'){
            flag = 1;
            ch[0] = '0';
        }else if(ch[0] == '-'){
            flag = -1;
            ch[0] = '0';
        }
        int sum = 0;
        for(int i = 0;i < ch.length;i++){
            if(ch[i] > '9' || ch[i] < '0'){
                sum = 0;
                break;
            }else{
                sum = sum*10+ch[i]-'0';
            }
        }
        return sum*flag;
    }

    public static void main(String[] args) {
        String s = "6786";
        StrToInt(s);
    }
}
