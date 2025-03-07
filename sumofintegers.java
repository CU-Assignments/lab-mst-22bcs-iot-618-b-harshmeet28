import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfIntegers {

    // Method to parse a string into an Integer
    public static Integer parseStringToInteger(String str) {
        return Integer.parseInt(str); // Using Integer's parseInt method
    }

    // Method to calculate the sum of a list of integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0; // Initialize sum to 0
        for (Integer number : numbers) { // Autoboxing occurs here
            sum += number; // Unboxing occurs here
        }
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(); // List to hold integers

        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine(); // Read user input
            if (input.equalsIgnoreCase("done")) { // Check for termination condition
                break; // Exit the loop if user types 'done'
            }
            try {
                Integer number = parseStringToInteger(input); // Parse string to Integer
                numbers.add(number); // Add the Integer to the list
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer."); // Handle invalid input
            }
        }

        int sum = calculateSum(numbers); // Calculate the sum of the list
        System.out.println("The sum of the entered integers is: " + sum); // Output the result

        scanner.close(); // Close the scanner
    }
}