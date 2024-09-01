public class Register {
    public Purse makeChange(double amt){
        double total = amt;
        Denomination[] denoms = {
            new Denomination(100.0, "One Hundred", "One Hundred Dollars", "100.jpg"),
            new Denomination(50.0, "Fifty", "Fifty Dollars", "50.jpg"),
            new Denomination(20.0, "Twenty", "Twenty Dollars", "20.jpg"),
            new Denomination(10.0, "Ten", "Ten Dollars", "10.jpg"),
            new Denomination(5.0, "Five", "Five Dollars", "5.jpg"),
            new Denomination(1.0, "One", "One Peso", "1.jpg"),
            new Denomination(0.25, "Twenty-Five", "Twenty-Five Cents", "25.jpg"),
            new Denomination(0.10, "Ten", "Ten Cents", "10.jpg"),
            new Denomination(0.05, "Five", "Five Cents", "5.jpg"),
            new Denomination(0.01, "One", "One Cent", "1.jpg")
        };
        Purse temp= new Purse();
        for (int i = 0; total < denoms[i].amt() && total != 0; i++){
            while (total >= denoms[i].amt()){
                temp.add(denoms[i], 1);
                total -= denoms[i].amt();
            }
        }

        return temp;
    }
}
