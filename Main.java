import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Theater theater = new Theater(5, 5); // Create a 5x5 seating chart

        while (true) {
            System.out.println("\nMovie Theater Booking System:");
            System.out.println("1. Display Seating Chart");
            System.out.println("2. Reserve a Seat");
            System.out.println("3. Cancel a Reservation");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            if (choice == 4) {
                break;
            }

            switch (choice) {
                case 1:
                    theater.displaySeatingChart();
                    break;
                case 2:
                    System.out.println("Enter row and column to reserve (0-indexed):");
                    int reserveRow = scanner.nextInt();
                    int reserveCol = scanner.nextInt();
                    theater.reserveSeats(reserveRow, reserveCol);
                    break;
                case 3:
                    System.out.println("Enter row and column to cancel (0-indexed):");
                    int cancelRow = scanner.nextInt();
                    int cancelCol = scanner.nextInt();
                    theater.cancelSeats(cancelRow, cancelCol);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
