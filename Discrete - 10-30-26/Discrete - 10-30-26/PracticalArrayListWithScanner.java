//—Club Registration—

import java.util.ArrayList;
import java.util.Scanner;

public class PracticalArrayListWithScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> members = new ArrayList<>();

        members.add("John");
        members.add("Maria");
        members.add("Alex");

        System.out.print("Enter new member name: ");
        String name = input.nextLine();

        members.add(name);

        System.out.println("\nClub Members:");

        for (int i = 0; i < members.size(); i++) {

            System.out.println((i + 1) + ". " + members.get(i));

        }

        System.out.println("Total Members: " + members.size());

        input.close();

    }
}