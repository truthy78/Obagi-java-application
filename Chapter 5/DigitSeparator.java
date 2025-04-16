import java.util.Scanner;

public class DigitSeparator {
    // Method to compute integer quotient
    public static int integerQuotient(int a, int b) {
        return a / b;
    }

    // Method to compute integer remainder
    public static int integerRemainder(int a, int b) {
        return a % b;
    }

    // Method to display digits separated by two spaces
    public static void displayDigits(int number) {
        String numString = Integer.toString(number);
        
        for (int i = 0; i < numString.length(); i++) {
            System.out.print(numString.charAt(i));
            if (i < numString.length() - 1) {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 99999: ");
        int number = scanner.nextInt();

        System.out.print("Separated digits: ");
        displayDigits(number);

        scanner.close();
    }
}
