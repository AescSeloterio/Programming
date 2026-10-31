//—Daily Class Schedule—

import java.util.LinkedHashMap;

public class LinkedHashMapInJava {
    public static void main(String[] args) {
        LinkedHashMap<String, String> schedule = new LinkedHashMap<>();
        schedule.put("9:00 AM", "Math");
        schedule.put("1:00 PM", "Java Lab");
        schedule.put("11:00 AM", "English");

        System.out.println("Class Schedule: " + schedule);
    }
}
