import java.util.Scanner;

public class Exponentiation {
    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        int powerResult = integerPower(base, exponent);

        System.out.printf("%d^%d = %d%n", base, exponent, powerResult);

        scanner.close();
    }
}
