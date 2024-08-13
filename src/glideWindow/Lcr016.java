package glideWindow;

public class Lcr016 {
    public static void main(String[] args) {
        Lcr016 lcr016 = new Lcr016();
        lcr016.lengthOfLongestSubstring("abcabcbb");
    }
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        //用数组模拟哈希
        int[] hash = new int[128];
        int left = 0,right = 0,length = ch.length;
        int ret = Integer.MIN_VALUE;
        for(right = 0;right < length;right++){
            //进入窗口
            hash[ch[right]]++;
            while(left < length -1 && hash[ch[right]] > 1){
                //判断,重复则滑出窗口
                hash[ch[left++]]--;
            }
            ret = Math.max(right - left + 1,ret);
        }
        return ret == Integer.MIN_VALUE ? 0 : ret;
    }
}
