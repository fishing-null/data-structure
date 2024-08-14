package glideWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Num30 {
    public static void main(String[] args) {
        Num30 num30 = new Num30();
        System.out.println(num30.findSubstring("wordgoodgoodgoodbestword",new String[] {"good","good","best","word"}));
    }
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int dictSize = words[0].length(),len = s.length();
        List<Integer> ret = new ArrayList<>();
        //创建一个哈希表存储字符串及其出现次数
        for(String word:words) map.put(word, map.getOrDefault(word,0) + 1);
        for (int i = 0; i < dictSize; i++) {
            //变量count统计入窗口单词个数
            int left = i,right = i,count = 0;
            HashMap<String,Integer> map2 = new HashMap<>();
            while(right + dictSize <= len){
                //截取字符串入窗口
                String inString = s.substring(right,right + dictSize);
                map2.put(inString, map2.getOrDefault(inString,0) + 1);
                //入窗口有效(有效指的是字符串在map中存在) 则count++
                if(map2.get(inString) <= map.getOrDefault(inString,0)) count++;
                //对比单词长度,判断是否出窗口
                if(right - left + 1 > dictSize * words.length){
                    String outString = s.substring(left,left+dictSize);
                    if(map2.get(outString) <= map.getOrDefault(outString,0)) count--;
                    map2.put(outString,map2.get(outString) - 1);
                    left += dictSize;
                }
                //更新结果
                if(count == words.length) ret.add(left);
                right += dictSize;
            }
        }
        return ret;
    }
}
