package javaPractice;

import java.util.Scanner;

public class be1006 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double average = calcAverage(a, b, c);

        System.out.printf("MEDIA = %.1f\n", average);
    }

    public static double calcAverage(double a, double b, double c) {
        double weight2 = 2.0;
        double weight3 = 3.0;
        double weight5 = 5.0;
        double totalWeight = weight2 + weight3 + weight5;

        return ((a * weight2) + (b * weight3) + (c * weight5)) / totalWeight;
    }
}
