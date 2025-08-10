package javaPractice;

import java.util.Scanner;

public class be1002 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = 0;
        radius = sc.nextDouble();
        sc.close();

        double area = calcCircunferenceArea(radius);

        System.out.printf("A=%.4f\n", area);
    }

    public static double calcCircunferenceArea(double radius){
        return PI * (radius * radius);
    }

}


