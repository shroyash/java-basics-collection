import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        // Try-with-resources automatically closes the Scanner
        try (Scanner inputMark = new Scanner(System.in)) {
            System.out.println("Check Your Percentage!");

            System.out.println("Enter Your Name");
            String name = inputMark.nextLine();

            System.out.println("Enter Your Math Mark");
            float math = inputMark.nextFloat();

            System.out.println("Enter Your Computer Mark");
            float computer = inputMark.nextFloat();

            System.out.println("Enter Your Account Mark");
            float account = inputMark.nextFloat();

            float sum = math + computer + account;
            double percentage = (sum / 300) * 100;

            System.out.println("The percentage of " + name + " is " + percentage + "%");
        }
    }
}
