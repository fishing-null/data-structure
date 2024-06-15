package design;

import java.util.ArrayList;

public class RecentCounter {
    int requestCount;
    ArrayList<Integer> requestList;
    public RecentCounter() {
        this.requestCount = 0;
        requestList = new ArrayList<Integer>();
    }

    public int ping(int t) {
        //首先让该请求加入队列
        this.requestList.add(t);
        //count记录固定时间内的请求数量
        int count = 0;
        //返回固定时间内的请求数量
        for(int i = 0;i<requestList.size();i++){
            int startTime = t - 3000;
            int endTime = t;
            int requestTime = requestList.get(i);
            if(requestTime >= startTime && requestTime <= endTime) count++;
        }
        return count;
    }
}
