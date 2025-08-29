package javaPractice;

import java.util.Scanner;

public class be1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        sc.close();

        int timeInMinutes = calcTimeSpent(distance);

        System.out.printf("%d minutos\n", timeInMinutes);
    }

    public static int calcTimeSpent(int distance) {
        int hourInMinutes = 60;
        int differenceInKM = 30;

        return (hourInMinutes * distance) / differenceInKM;
    }
}
