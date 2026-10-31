//—Store Inventory—

import java.util.HashMap;

public class HashMapInJava {
    public static void main(String[] args) {
        HashMap<Integer, String> products = new HashMap<>();
        products.put(501, "Keyboard");
        products.put(502, "Mouse");
        products.put(503, "Monitor");

        System.out.println("Product 502: " + products.get(502));
        System.out.println("Total Products: " + products.size());
    }
}
