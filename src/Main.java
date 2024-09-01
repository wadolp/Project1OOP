import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Create Scanner
        Scanner scanner = new Scanner(System.in);
        // Creat Register
        Register register = new Register();

        // Make Change
        Purse purse = register.makeChange(123.99);
        // Display Purse contents to terminal
        purse.getValue();
        System.out.println(purse.toString());

        //purse.test1();

        scanner.nextLine();
        scanner.close();


    }
}