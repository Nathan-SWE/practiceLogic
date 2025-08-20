package javaPractice;

import java.util.Scanner;

public class be1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int bigger = getBiggerInt(a, b, c);

        System.out.printf("%d eh o maior\n", bigger);

    }
    public static int getBiggerInt(int a, int b, int c) {
        if(a >= b && a >= c) return a;

        if(b >= a && b >= c) return b;

        return c;
    }
}
