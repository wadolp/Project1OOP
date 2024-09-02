import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Create Scanner
        Scanner scanner = new Scanner(System.in);
        // Creat Register
        Register register = new Register();

        // Make Change
        Purse purse = register.makeChange(123.05);
        // Display Purse contents to terminal
        purse.getValue();
        System.out.println(purse.toString());
        System.out.println("\n"+purse.getValue());
        //purse.test1();

        scanner.nextLine();
        scanner.close();


    }
}