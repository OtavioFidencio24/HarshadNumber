import java.util.Scanner;

/**
 * This program checks if a user-provided number is a Harshad Number.
 * A Harshad Number is an integer that is divisible by the sum of its digits.
 */
public class Main {
    public static void main(String[] args) {
        // Declare variables
        int userInputNumber, result;
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Please enter a number: ");
        userInputNumber = scanner.nextInt();

        // Continue checking numbers until the user enters a non-positive number
        while (userInputNumber > 0) {
            result = 0;  // Initialize result to store the sum of digits

            // Convert the number to a string to iterate over its digits
            String number = Integer.toString(userInputNumber);

            // Calculate the sum of the digits
            for (int i = 0; i < number.length(); i++) {
                // Get the numeric value of each character and add it to the result
                result += Character.getNumericValue(number.charAt(i));
            }

            // Check if the number is divisible by the sum of its digits
            if (userInputNumber % result == 0) {
                System.out.println("The number " + userInputNumber + " is a Harshad Number");
            } else {
                System.out.println("The number " + userInputNumber + " isn't a Harshad Number");
            }

            // Prompt the user to enter another number
            System.out.print("\nPlease enter a number: ");
            userInputNumber = scanner.nextInt();
        }
    }
}