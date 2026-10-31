//—Package Delivery System—

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInJava {
    public static void main(String[] args) {
        Deque<String> deliveries = new ArrayDeque<>();
        deliveries.addLast("Package A");
        deliveries.addLast("Package B");
        deliveries.addFirst("Express Package");

        System.out.println("Delivery Line: " + deliveries);
        deliveries.removeLast();
        System.out.println("After Removing Last: " + deliveries);
    }
}
