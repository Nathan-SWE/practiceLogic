package javaPractice;

import java.util.Scanner;

public class be1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanceInKm = sc.nextInt();
        double fuelSpent = sc.nextDouble();
        sc.close();

        double consumption = calcConsumption(distanceInKm, fuelSpent);

        System.out.printf("%.3f km/l\n", consumption);
    }

    public static double calcConsumption(int distance, double fuel) {
        if (fuel > 0) return distance / fuel;

        return 0;
    }
}
