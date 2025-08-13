package javaPractice;

import java.util.Locale;
import java.util.Scanner;

public class be1009 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String name = sc.nextLine();
        double baseSalary = sc.nextDouble();
        double monthlySales =  sc.nextDouble();
        sc.close();

        double finalSalary = calcSalaryBonuses(baseSalary, monthlySales);

        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);
    }
    public static double calcSalaryBonuses(double baseSalary, double monthlySales) {
        return baseSalary + (monthlySales * 0.15);
    }
}
