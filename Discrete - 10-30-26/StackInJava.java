//—Undo Action History—

import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();
        actions.push("Type title");
        actions.push("Add paragraph");
        actions.push("Insert picture");

        System.out.println("Action History: " + actions);
        System.out.println("Latest Action: " + actions.peek());
        System.out.println("Undo: " + actions.pop());
        System.out.println("Remaining Actions: " + actions);
        System.out.println("Is Empty? " + actions.empty());
    }
}
