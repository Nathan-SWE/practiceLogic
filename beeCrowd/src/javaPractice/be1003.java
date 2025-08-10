package javaPractice;

import java.util.Scanner;

public class be1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; int b = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int total = sum(a, b);

        System.out.printf("SOMA = %d\n", total);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
