//—Daily Task Manager—

import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Study Java");
        tasks.add("Finish assignment");
        tasks.add("Prepare notes");

        System.out.println("Original Tasks: " + tasks);
        tasks.addFirst("Check class schedule");
        tasks.addLast("Review lessons");
        System.out.println("Updated Tasks: " + tasks);

        tasks.removeFirst();
        System.out.println("After Removing First: " + tasks);
    }
}
