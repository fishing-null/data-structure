package binary;

import java.math.BigInteger;

public class BM22 {
    public static void main(String[] args) {
        BM22 bm22 = new BM22();
        bm22.compare("0.1","0.01");
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 比较版本号
     * @param version1 string字符串
     * @param version2 string字符串
     * @return int整型
     */
    public int compare (String version1, String version2) {
        // write code here
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for(int i = 0; i < Math.max(v1.length,v2.length); i++){
            BigInteger rev1 = i < v1.length ? new BigInteger(v1[i]) : new BigInteger("0");
            BigInteger rev2 = i < v2.length ? new BigInteger(v2[i]) : new BigInteger("0");;
            if (rev1.compareTo(rev2) < 0) return -1;
            if (rev1.compareTo(rev2) > 0) return 1;
        }
        return 0;
    }
}
