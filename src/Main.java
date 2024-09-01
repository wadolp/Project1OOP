public class Main {
    public static void main(String[] args) {
        // Creat Register
        Register register = new Register();

        // Make Change
        Purse purse = register.makeChange(123.99);
        // Display Purse contents to terminal
        purse.getValue();
        System.out.println(purse.toString());

    }
}