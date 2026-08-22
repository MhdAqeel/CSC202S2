public class BalancedExpression {

    // Method to check if the brackets in a string are balanced
    public static boolean isBalanced(String expression) {
        // 1. Create an instance of your linked list stack
        StackListADT stack = new StackListADT();

        // 2. Loop through every character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If it is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(String.valueOf(ch));
            } 
            // If it is a closing bracket, we need to check it against the stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                // If the stack is empty, we have a closing bracket with no opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element and get the character out of the returned string
                String poppedStr = stack.pop();
                char poppedChar = poppedStr.charAt(0);

                // Check if the popped bracket matches the current closing bracket
                if (!isMatchingPair(poppedChar, ch)) {
                    return false; 
                }
            }
        }

        // 3. If the stack is empty at the end, all brackets were matched!
        return stack.isEmpty();
    }

    // Helper method to check if two brackets are a valid pair
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // Test cases
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "((a + b) * [c - d])"; // Mixed with other characters

        System.out.println("Expression 1: " + expression1 + " is balanced? " + isBalanced(expression1));
        System.out.println("Expression 2: " + expression2 + " is balanced? " + isBalanced(expression2));
        System.out.println("Expression 3: " + expression3 + " is balanced? " + isBalanced(expression3));
    }
}