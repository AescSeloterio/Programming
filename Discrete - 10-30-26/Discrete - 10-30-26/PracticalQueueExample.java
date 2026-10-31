//—Printer Job Management—

import java.util.LinkedList;
import java.util.Queue;

public class PracticalQueueExample {
    public static void main(String[] args) {
        Queue<String> printJobs = new LinkedList<>();
        printJobs.offer("Science Report");
        printJobs.offer("Math Worksheet");
        printJobs.offer("Project Cover Page");

        while (!printJobs.isEmpty()) {
            String currentJob = printJobs.poll();
            System.out.println("Now printing: " + currentJob);
        }
    }
}
