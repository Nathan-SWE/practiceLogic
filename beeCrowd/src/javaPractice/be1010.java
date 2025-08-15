package javaPractice;
import java.util.Locale;
import java.util.Scanner;

public class be1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        final int TOTAL_PRODUCTS = 2;
        double finalValue = 0;

        for (int i = 0; i < TOTAL_PRODUCTS; i++) {
            finalValue += calcTotalValue(sc);
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", finalValue);
        sc.close();
    }
    public static double calcTotalValue(Scanner scanner) {
        int productCode = scanner.nextInt();
        int quantity = scanner.nextInt();
        double price = scanner.nextDouble();
        return quantity * price;
    }
}
