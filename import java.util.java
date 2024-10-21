import java.util.ArrayList;
import java.util.Scanner;

public class PlaneManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Plane> planes = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    addNewPlane();
                    break;
                case 2:
                    editPlaneInfo();
                    break;
                case 3:
                    viewPlaneInfo();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the Plane Management System.");
    }

    private static void displayMenu() {
        System.out.println("\nPlane Management System");
        System.out.println("1. Add a new plane");
        System.out.println("2. Edit plane information");
        System.out.println("3. View plane information");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return choice;
    }

    private static void addNewPlane() {
        System.out.print("Enter the tail number for the new plane: ");
        String tailNumber = scanner.nextLine();
        planes.add(new Plane(tailNumber));
        System.out.println("New plane added successfully.");
    }

    private static void editPlaneInfo() {
        System.out.print("Enter the tail number of the plane to edit: ");
        String tailNumber = scanner.nextLine();
        Plane plane = findPlane(tailNumber);
        if (plane == null) {
            System.out.println("Plane not found.");
            return;
        }

        System.out.println("1. Edit model");
        System.out.println("2. Add flight hours");
        System.out.println("3. Add part");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter new model: ");
                String newModel = scanner.nextLine();
                plane.editModel(newModel);
                break;
            case 2:
                System.out.print("Enter flight hours to add: ");
                double hours = scanner.nextDouble();
                plane.addFlightHours(hours);
                break;
            case 3:
                System.out.print("Enter new part: ");
                String newPart = scanner.nextLine();
                plane.addPart(newPart);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void viewPlaneInfo() {
        System.out.print("Enter the tail number of the plane to view: ");
        String tailNumber = scanner.nextLine();
        Plane plane = findPlane(tailNumber);
        if (plane == null) {
            System.out.println("Plane not found.");
            return;
        }

        System.out.println("Tail Number: " + plane.getTailNumber());
        System.out.println("Flight Hours: " + plane.getFlightHours());
        System.out.println("Parts: " + plane.getParts());
    }

    private static Plane findPlane(String tailNumber) {
        for (Plane plane : planes) {
            if (plane.getTailNumber().equals(tailNumber)) {
                return plane;
            }
        }
        return null;
    }
}