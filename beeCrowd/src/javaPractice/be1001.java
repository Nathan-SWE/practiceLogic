package javaPractice;

import java.util.Scanner;

public class be1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int result = sum(a, b);

        System.out.printf("X = %d\n", result);
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
