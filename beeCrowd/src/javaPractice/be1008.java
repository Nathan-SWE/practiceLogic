package javaPractice;

import java.util.Locale;
import java.util.Scanner;

public class be1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int workerNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double amountPerHour = sc.nextDouble();
        sc.close();

        double monthIncome = calcSalary(workedHours, amountPerHour);

        System.out.printf("NUMBER = %d\n", workerNumber);
        System.out.printf("SALARY = U$ %.2f\n", monthIncome);
    }

    public static double calcSalary(int workedHours, double amountPerHour) {
        return workedHours * amountPerHour;
    }
}
