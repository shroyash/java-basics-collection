import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Please enter an integer:");
            
            // Check if the next input is an integer
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                System.out.println("You entered the integer: " + userInput);
            } else {
                System.out.println("That's not an integer. Please try again.");
            }

        } 
    }
}
