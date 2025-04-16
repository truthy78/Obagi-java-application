import java.util.Scanner;

public class ParkingCharges {
    public static double calculateCharges(double hours) {
        double charge = 2.00; // Minimum charge for up to 3 hours
        if (hours > 3) {
            charge += Math.min((hours - 3) * 0.50, 8.00); // Additional charge per extra hour, max $10
        }
        return Math.min(charge, 10.00); // Ensure maximum charge is $10.00
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0;

        while (true) {
            System.out.print("Enter parking hours (-1 to exit): ");
            double hours = scanner.nextDouble();
            if (hours == -1) {
                break;
            }

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Parking charge: $%.2f%n", charge);
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        scanner.close();
    }
}
