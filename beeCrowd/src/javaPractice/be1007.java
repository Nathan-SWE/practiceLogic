package javaPractice;

import java.util.Scanner;

public class be1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int diference = calcDiference(a, b, c, d);

        System.out.printf("DIFERENCA = %d\n", diference);
    }

    public static int calcDiference(int a, int b, int c, int d) {
        return (a*b) - (c*d);
    }
}
