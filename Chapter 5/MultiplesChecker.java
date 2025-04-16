import java.util.Scanner;

public class MultiplesChecker {
    // Method to determine if second number is a multiple of the first
    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first integer (-1 to exit): ");
            int first = scanner.nextInt();

            if (first == -1) {
                break;
            }

            System.out.print("Enter second integer: ");
            int second = scanner.nextInt();

            if (isMultiple(first, second)) {
                System.out.printf("%d is a multiple of %d.%n", second, first);
            } else {
                System.out.printf("%d is NOT a multiple of %d.%n", second, first);
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}
