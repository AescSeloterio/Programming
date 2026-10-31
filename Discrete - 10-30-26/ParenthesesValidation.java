//—Mathematical Formula Checker—

import java.util.Stack;

public class ParenthesesValidation {
    public static void main(String[] args) {
        String formula = "(10 + (5 * 2))";
        Stack<Character> parentheses = new Stack<>();
        boolean balanced = true;

        for (char ch : formula.toCharArray()) {
            if (ch == '(') {
                parentheses.push(ch);
            } else if (ch == ')') {
                if (parentheses.isEmpty()) {
                    balanced = false;
                    break;
                }
                parentheses.pop();
            }
        }

        if (!parentheses.isEmpty()) {
            balanced = false;
        }

        System.out.println("Formula: " + formula);
        System.out.println("Parentheses Balanced? " + balanced);
    }
}
