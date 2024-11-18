<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Flight Management System - Java Code</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            background-color: #f5f5f5;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h1 {
            color: #333;
            text-align: center;
            border-bottom: 2px solid #eee;
            padding-bottom: 10px;
        }
        pre {
            background-color: #f8f8f8;
            padding: 15px;
            border-radius: 5px;
            overflow-x: auto;
            border: 1px solid #ddd;
        }
        code {
            font-family: 'Courier New', Courier, monospace;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Flight Management System - Java Code</h1>
        <pre><code>
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
        </code></pre>
    </div>
</body>
</html>
