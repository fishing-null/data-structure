package simulation;

public class LCP61 {
    public static void main(String[] args) {
        LCP61 lcp61 = new LCP61();
        lcp61.temperatureTrend(new int[] {21,18,18,18,31},new int[] {34,32,16,16,17});
    }
    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        //温度趋势数组，用于表示温度变化的趋势
        //0-表示平稳 1-上升 -1-下降
        int[] temperatureTrendA = new int[temperatureA.length - 1];
        int[] temperatureTrendB = new int[temperatureB.length - 1];
        int maxTrendLength = Integer.MIN_VALUE;
        for(int i = 1;i < temperatureA.length;i++){
            if(temperatureA[i] > temperatureA[i-1]) {
                temperatureTrendA[i - 1] = 1;
            }
            else if(temperatureA[i] < temperatureA[i-1]) {
                temperatureTrendA[i - 1] = -1;
            }
            else if(temperatureA[i] == temperatureA[i-1]) {
                temperatureTrendA[i - 1] = 0;
            }

            if(temperatureB[i] > temperatureB[i-1]) {
                temperatureTrendB[i - 1] = 1;
            }
            else if(temperatureB[i] < temperatureB[i-1]) {
                temperatureTrendB[i - 1] = -1;
            }
            else if(temperatureB[i] == temperatureB[i-1]) {
                temperatureTrendB[i - 1] = 0;
            }

        }
        int tmpLength = 0;
        for(int i = 0;i < temperatureTrendA.length ; i++){
            if(temperatureTrendA[i] == temperatureTrendB[i]) {
                tmpLength++;
            }else{
                maxTrendLength = Math.max(tmpLength,maxTrendLength);
                tmpLength = 0;
            }
        }
        return Math.max(tmpLength,maxTrendLength);
    }
}
