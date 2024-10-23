import java.util.Scanner;

public class FlightMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Display welcome message
        System.out.println("====================================");
        System.out.println("    Welcome to Flight Management    ");
        System.out.println("====================================");

        while (running) {
            // Display menu options
            System.out.println("\nPlease select an option:");
            System.out.println("1. Aircraft List");
            System.out.println("2. Ticket List");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice (1-3): ");

            // Get user input
            String choice = scanner.nextLine();

            // Process user choice
            switch (choice) {
                case "1":
                    System.out.println("\nDisplaying Aircraft List...");
                    // Add aircraft list functionality here
                    break;
                case "2":
                    System.out.println("\nDisplaying Ticket List...");
                    // Add ticket list functionality here
                    break;
                case "3":
                    System.out.println("\nThank you for using Flight Management. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");
                    break;
            }
        }
        
        scanner.close();
    }
}