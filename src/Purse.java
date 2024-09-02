import java.util.HashMap;

public class Purse {
    private HashMap<Denomination, Integer> purseList;
    private int totalCents;

    // Default constructor
    public Purse() {
        purseList = new HashMap<>();
        totalCents = 0;
    }

    // Adds Denomination and amount to HashMap
    public void add(Denomination name, int count) {
        if (purseList.containsKey(name)) {
            purseList.put(name, purseList.get(name) + count);
        } else {
            purseList.put(name, count);
        }
        totalCents += (int) (name.amt() * 100) * count;
    }

    // Removes Denomination amount or entire Denomination
    public void remove(Denomination name, int count) {
        if (purseList.containsKey(name)) {
            int currentCount = purseList.get(name);
            if (currentCount > count) {
                purseList.put(name, currentCount - count);
                totalCents -= (int) (name.amt() * 100) * count;
            } else {
                purseList.remove(name);
                totalCents -= (int) (name.amt() * 100) * currentCount;
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
        return totalCents / 100.0;
    }

    // Test method
    public int test1() {
        System.out.println("test1");
        System.out.println(purseList.toString());
        System.out.println("\n\n\nEnd of Test amount in cents:" + totalCents + "1\n");
        return 1;
    }
}