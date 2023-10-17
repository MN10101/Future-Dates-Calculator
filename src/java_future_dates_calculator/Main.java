package java_future_dates_calculator;

import java.time.LocalDate;  // Import the LocalDate class
import java.util.Scanner;     // Import the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input
        
        System.out.println("Enter a starting date (YYYY-MM-DD): ");
        String starting = scanner.nextLine();  // Prompt the user for a starting date and read it as a string
        
        System.out.println("Enter the number of days into the future: ");
        int future = scanner.nextInt();  // Prompt the user for the number of days into the future
        
        scanner.close();  // Close the scanner to release resources
        try {
            LocalDate startingDate = LocalDate.parse(starting);  // Parse the starting date string into a LocalDate object
            LocalDate futureDate = startingDate.plusDays(future);  // Calculate the future date by adding the specified number of days
            System.out.println("The future date is: " + futureDate.toString());  // Print the calculated future date
        } catch (Exception e) {
            System.out.println("Please enter the starting date again");  // Handle exceptions by asking the user to enter the starting date again
        }
    }
}








