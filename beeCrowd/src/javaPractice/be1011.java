package javaPractice;

import java.util.Scanner;
import java.util.Locale;

public class be1011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        final double PI = 3.14159;
        double radius =  sc.nextDouble();
        sc.close();

        double sphere = calcSphereVolume(radius, PI);

        System.out.printf("VOLUME = %.3f\n", sphere);
    }

    public static double calcSphereVolume(double radius, double PI){
        return (4.0/3.0) * PI * (radius * radius * radius);
    }
}
