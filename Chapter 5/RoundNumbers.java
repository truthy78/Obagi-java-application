import java.util.Scanner;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a decimal number (-1 to exit): ");
            double number = scanner.nextDouble();

            if (number == -1) {
                break;
            }

            int roundedNumber = (int) Math.floor(number + 0.5);
            System.out.printf("Original number: %.2f%nRounded number: %d%n", number, roundedNumber);
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}
