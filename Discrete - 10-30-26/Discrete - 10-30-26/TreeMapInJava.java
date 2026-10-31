//—Library Book Catalog—

import java.util.TreeMap;

public class TreeMapInJava {
    public static void main(String[] args) {
        TreeMap<Integer, String> books = new TreeMap<>();
        books.put(303, "Computer Networks");
        books.put(101, "Java Basics");
        books.put(202, "Algorithms");

        System.out.println("Books by ID: " + books);
    }
}
