//—Workshop Attendees—

import java.util.LinkedHashSet;

public class LinkedHashSetInJava {
    public static void main(String[] args) {
        LinkedHashSet<String> attendees = new LinkedHashSet<>();
        attendees.add("Ella");
        attendees.add("Noah");
        attendees.add("Liam");
        attendees.add("Ella");

        System.out.println("Workshop Attendees: " + attendees);
    }
}
