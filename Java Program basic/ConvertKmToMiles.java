
import java.util.Scanner;

public class ConvertKmToMiles {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);

        // Prompt for input
        System.out.println("Convert kilometers into miles");

        // Get the input in kilometers
        double kilometerNum = inputNum.nextDouble();

        // Convert kilometers to miles by dividing
        double miles = kilometerNum / 1.60934;

        // Output the result
        System.out.println(kilometerNum + " kilometers is equal to " + miles + " miles.");
        
        // Close the scanner
        inputNum.close();
    }
}

