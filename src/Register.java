public class Register {
    public Purse makeChange(double amt) {
        double total = amt;
        int totalCents = (int) (total * 100);
        Denomination[] denoms = {
            new Denomination(100.0, "One Hundred Dollar", "One Hundred Dollars", "100d.jpg"),
            new Denomination(50.0, "Fifty Dollar", "Fifty Dollars", "50d.jpg"),
            new Denomination(20.0, "Twenty Dollar", "Twenty Dollars", "20d.jpg"),
            new Denomination(10.0, "Ten Dollar", "Ten Dollars", "10d.jpg"),
            new Denomination(5.0, "Five Dollar", "Five Dollars", "5d.jpg"),
            new Denomination(1.0, "One Dollar", "One Dollar", "1d.jpg"),
            new Denomination(0.25, "Quarter", "Twenty-Five Cents", "25.jpg"),
            new Denomination(0.10, "Dime", "Ten Cents", "10.jpg"),
            new Denomination(0.05, "Nickel", "Five Cents", "5.jpg"),
            new Denomination(0.01, "Penny", "One Cent", "1.jpg")
        };
        Purse temp = new Purse();
        for (int i = 0; i < denoms.length && totalCents > 0; i++) {
            while (totalCents >= (int) (denoms[i].amt()*100)) {
                temp.add(denoms[i], 1);
                totalCents -= (int) (denoms[i].amt()*100);
            }
        }
        return temp;
    }
}
