package javaPractice;

import java.util.Scanner;

public class be1017 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        final int kmL = 12;
        int timeSpent = sc.nextInt();
        int averageSpeed = sc.nextInt();
        sc.close();

        double litersConsumption = calcConsumption(timeSpent, averageSpeed, kmL);

        System.out.printf("%.3f\n", litersConsumption);
    }
    public static double calcConsumption(int timeSpent, int averageSpeed, int kmL){
        return ((double) averageSpeed / kmL) * timeSpent;
    }
}
