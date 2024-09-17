
import java.util.Scanner;

public class GreetMessage {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = inputName.nextLine();
        System.out.println("Hello, " + name + "have a good day");
        inputName.close();
    }
    
}
