import java.util.HashMap;

public class Purse {
    private HashMap<Denomination, Integer> purseList;
    public Purse() {
        purseList = new HashMap<>();
    }
    public void add(Denomination name, int count) {
        if (purseList.containsKey(name)) {
            purseList.put(name, purseList.get(name) + count);
        } else {
            purseList.put(name, count);
        }
    }
    public void remove(Denomination name, int count) {
        if (purseList.containsKey(name)) {
            if (purseList.get(name) >= count) {
                purseList.put(name, purseList.get(name) - count);
            } else {
                purseList.remove(name);
            }
        }
    }
    public String toString() {
        String result = "";
       for(Denomination key : purseList.keySet()) {
           result = (result+ "\n" + key + " " + purseList.get(key));
       }
       return result;
    }
    
    public double getValue() {
        double total = 0;
        for(Denomination key : purseList.keySet()) {
            total += key.amt() * purseList.get(key);
        }
       return total;
    }
}
