import java.util.Scanner;

public class RoundingNumbers {
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a decimal number (-1 to exit): ");
            double number = scanner.nextDouble();

            if (number == -1) {
                break;
            }

            System.out.printf("Original number: %.5f%n", number);
            System.out.printf("Rounded to integer: %.0f%n", roundToInteger(number));
            System.out.printf("Rounded to tenths: %.1f%n", roundToTenths(number));
            System.out.printf("Rounded to hundredths: %.2f%n", roundToHundredths(number));
            System.out.printf("Rounded to thousandths: %.3f%n", roundToThousandths(number));
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}
