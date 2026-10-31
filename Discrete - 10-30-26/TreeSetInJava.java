//—Sorted Temperatures—

import java.util.TreeSet;

public class TreeSetInJava {
    public static void main(String[] args) {
        TreeSet<Integer> temperatures = new TreeSet<>();
        temperatures.add(32);
        temperatures.add(28);
        temperatures.add(30);
        temperatures.add(29);
        temperatures.add(30);

        System.out.println("Sorted Unique Temperatures: " + temperatures);
    }
}
