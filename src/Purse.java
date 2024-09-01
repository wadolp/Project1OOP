import java.util.HashMap;

public class Purse {
    private HashMap<String, Integer> Purselist;
    public Purse() {
        Purselist = new HashMap<>();
    }
    public void add(String name, int count) {
        Purselist.put(name, count);
    }
    public void reomove(String name, int count) {
        if (Purselist.containsKey(name)) {
            int current = Purselist.get(name);
            if (current - count > 0) {
                Purselist.put(name, current - count);
            } else {
                Purselist.remove(name);
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : Purselist.keySet()) {
            sb.append(key + " : " + Purselist.get(key) + "\n");
        }
        return sb.toString();
    }
    
    public double getValue() {
        double total = 0.0;
        for (String key : Purselist.keySet()) {
            total += Double.parseDouble(key) * Purselist.get(key);
        }
        return total;
    }
}
