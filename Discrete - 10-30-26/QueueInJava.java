//—Customer Ticket System—

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<String> tickets = new LinkedList<>();
        tickets.offer("Ticket 201");
        tickets.offer("Ticket 202");
        tickets.offer("Ticket 203");

        System.out.println("Waiting Tickets: " + tickets);
        System.out.println("Next Ticket: " + tickets.peek());
        tickets.poll();
        System.out.println("After Serving: " + tickets);
    }
}
