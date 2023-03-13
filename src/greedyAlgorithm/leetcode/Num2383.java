package greedyAlgorithm.leetcode;

public class Num2383 {
    public static void main(String[] args) {
        int[] energy = new int[]{1,1,1,1};
        int[] experience = new int[]{1,1,1,50};
        minNumberOfHours(1,1,energy,experience);
    }
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int totalEnergy = 0;
        for (int i = 0; i < energy.length; i++) {
            totalEnergy += energy[i];
        }
        int time = 0;
        if(totalEnergy >= initialEnergy){
            time += totalEnergy - initialEnergy + 1;
        }
        for (int i = 0; i < experience.length; i++) {
            if(initialExperience > experience[i]){
                initialExperience += experience[i];
            }else {
                time += experience[i]-initialExperience+1;
                initialExperience += experience[i]-initialExperience+1;
                initialExperience += experience[i];
            }
        }
        return time;
    }
}
