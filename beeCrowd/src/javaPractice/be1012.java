package javaPractice;

import java.util.Scanner;

public class be1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double areaTriangleRetangle = calcAreaTriangleRetangle(a, c);
        double areaCircle = calcAreaCircle(c, PI);
        double areaTrapezium = calcAreaTrapezium(a, b, c);
        double areaSquare = calcAreaSquare(b);
        double areaRectangle = areaRectangle(a, b);

        System.out.printf("TRIANGULO: %.3f\n", areaTriangleRetangle);
        System.out.printf("CIRCULO: %.3f\n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f\n", areaSquare);
        System.out.printf("RETANGULO: %.3f\n", areaRectangle);
    }
    public static double calcAreaTriangleRetangle(double baseA,double heightB){
        return  (baseA * heightB) / 2;
    }

    public static double calcAreaCircle(double radius,double PI){
        return PI * (radius * radius);
    }

    public static double calcAreaTrapezium(double baseA,double baseB,double heightC){
        return (baseA + baseB) *  heightC / 2;
    }

    public static double calcAreaSquare(double side){
        return side * side;
    }

    public static double areaRectangle(double baseA, double heightB){
        return baseA * heightB;
    }
}
