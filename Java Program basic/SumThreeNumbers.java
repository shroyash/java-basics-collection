
import java.util.Scanner;

// Write a program to sum three numbers in Java
public class SumThreeNumbers {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNum = inputNum.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNum = inputNum.nextInt();

        // Prompt user to enter the third number
        System.out.print("Enter the third number: ");
        int thirdNum = inputNum.nextInt();

        // Calculate the sum
        int sum = firstNum + secondNum + thirdNum;

        // Display the result
        System.out.println("The sum of the three numbers is: " + sum);

        // Close the scanner
        inputNum.close();
    }
}

