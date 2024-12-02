import java.util.Scanner;
import java.util.ArrayList;

public class FlightMenu {
    private static database fleetDatabase;
    private static Scanner scanner;

    public static void main(String[] args) {
        fleetDatabase = new database();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Aircraft Maintenance System ===");
            System.out.println("1. View All Aircraft");
            System.out.println("2. View All Tickets");
            System.out.println("3. View Open Tickets");
            System.out.println("4. Create New Ticket");
            System.out.println("5. Exit");
            System.out.print("\nEnter choice (1-5): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewAllAircraft();
                    break;
                case "2":
                    viewAllTickets();
                    break;
                case "3":
                    viewOpenTickets();
                    break;
                case "4":
                    createNewTicket();
                    break;
                case "5":
                    System.out.println("\nExiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    private static void viewAllAircraft() {
        System.out.println("\n=== Aircraft List ===");
        ArrayList<plane> fleet = fleetDatabase.returnFleet();
        for (plane p : fleet) {
            System.out.println("\nTail #: " + p.getTailNumber());
            System.out.println("Model: " + p.getModel());
            System.out.println("Flight Hours: " + p.getFlightHours());
        }
    }

    private static void viewAllTickets() {
        System.out.println("\n=== All Tickets ===");
        ArrayList<ticket> tickets = fleetDatabase.getAllTickets();
        displayTickets(tickets);
    }

    private static void viewOpenTickets() {
        System.out.println("\n=== Open Tickets ===");
        ArrayList<ticket> openTickets = fleetDatabase.openTickets();
        displayTickets(openTickets);
    }

    private static void displayTickets(ArrayList<ticket> tickets) {
        if (tickets.isEmpty()) {
            System.out.println("No tickets to display.");
            return;
        }

        for (ticket t : tickets) {
            System.out.println("\n----------------------------------------");
            System.out.println("Ticket #: " + t.getTicketNumber());
            System.out.println("Aircraft: " + t.getTailNumber());
            System.out.println("Status: " + (t.getStatus() ? "Open" : "Closed"));
            System.out.println("Critical: " + (t.getCriticalStatus() ? "Yes" : "No"));
            System.out.println("Part: " + t.getProblem());
            System.out.println("Description: " + t.getDescription());
        }
    }

    private static void createNewTicket() {
        System.out.println("\n=== Create New Ticket ===");

        // Get ticket details from user
        System.out.print("Enter aircraft tail number: ");
        String tailNumber = scanner.nextLine();

        System.out.print("Is this a critical issue? (true/false): ");
        boolean isCritical = scanner.nextLine().equalsIgnoreCase("true");

        System.out.print("Enter affected part: ");
        String part = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        // Create and set up the new ticket
        ticket newTicket = new ticket();
        newTicket.setTailNumber(tailNumber);
        newTicket.setTicketNumber(fleetDatabase.getNextTicketNumber());
        newTicket.criticalStatus(isCritical);
        newTicket.addProblem(part);
        newTicket.addDescription(description);
        newTicket.updateStatus(true); // Set as open

        // Add to database
        fleetDatabase.addNewTicket(newTicket);

        System.out.println("\nTicket created successfully!");
        System.out.println("New ticket details:");
        System.out.println("----------------------------------------");
        System.out.println("Ticket #: " + newTicket.getTicketNumber());
        System.out.println("Aircraft: " + newTicket.getTailNumber());
        System.out.println("Critical: " + (newTicket.getCriticalStatus() ? "Yes" : "No"));
        System.out.println("Part: " + newTicket.getProblem());
        System.out.println("Description: " + newTicket.getDescription());
    }
}