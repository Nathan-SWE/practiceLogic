package javaPractice;

import java.util.Scanner;

public class be1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; int b = 0;

        a =  sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int prod = calcProd(a, b);

        System.out.printf("PROD = %d\n", prod);

    }

    public static int calcProd(int a, int b) {
        return a * b;
    }
}
