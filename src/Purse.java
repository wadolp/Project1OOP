import java.util.HashMap;

public class Purse {
    private HashMap<Denomination, Integer> purseList;
    private double total;

    // Default constructor
    public Purse() {
        purseList = new HashMap<>();
        total = 0.0;
    }

    // Adds Denomination and amount to HashMap
    public void add(Denomination name, int count) {
        if (purseList.containsKey(name)) {
            purseList.put(name, purseList.get(name) + count);
        } else {
            purseList.put(name, count);
        }
        total += (name.amt() * count);
    }

    // Removes Denomination amount or entire Denomination
    public void remove(Denomination name, int count) {
        if (purseList.containsKey(name)) {
            int currentCount = purseList.get(name);
            if (currentCount > count) {
                purseList.put(name, currentCount - count);
                total -= (name.amt() * count);
            } else {
                purseList.remove(name);
                total -= (name.amt() * currentCount);
            }
        }
    }

    // Converts HashMap to string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Denomination key : purseList.keySet()) {
            result.append(key.name()).append(": ").append(purseList.get(key)).append("\n");
        }
        return result.toString();
    }

    // Returns the total value of the purse
    public double getValue() {
        return total;
    }

    // Test method
    public int test1() {
        System.out.println("test1");
        System.out.println(purseList.toString());
        System.out.println("\n\n\nEnd of Test 1\n");
        return 1;
    }
}
