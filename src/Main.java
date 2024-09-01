public class Main {
    public static void main(String[] args) {
        denomination[] denoms = {
            new denomination(100.0, "One Hundred", "One Hundred Pesos", "100.jpg"),
            new denomination(50.0, "Fifty", "Fifty Pesos", "50.jpg"),
            new denomination(20.0, "Twenty", "Twenty Pesos", "20.jpg"),
            new denomination(10.0, "Ten", "Ten Pesos", "10.jpg"),
            new denomination(5.0, "Five", "Five Pesos", "5.jpg"),
            new denomination(1.0, "One", "One Peso", "1.jpg"),
            new denomination(0.25, "Twenty-Five", "Twenty-Five Cents", "25.jpg"),
            new denomination(0.10, "Ten", "Ten Cents", "10.jpg"),
            new denomination(0.05, "Five", "Five Cents", "5.jpg"),
            new denomination(0.01, "One", "One Cent", "1.jpg")
        };
        for (denomination d : denoms) {
            System.out.println(d);
        }

    }
}