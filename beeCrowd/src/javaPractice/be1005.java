package javaPractice;

import java.util.Scanner;

public class be1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0; double b = 0;

        a = sc.nextDouble();
        b = sc.nextDouble();
        sc.close();

        double average = calcAverage(a, b);

        System.out.printf("MEDIA = %.5f\n", average);
    }

    public static double calcAverage(double a, double b) {
        return ((a * 3.5) + (b * 7.5)) / 11;
    }
}
