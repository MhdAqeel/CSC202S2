public class BalancedExpression {

    public static boolean isBalanced(String expression) {
        StackListADT stack = new StackListADT();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(String.valueOf(ch));
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                if (stack.isEmpty()) {
                    return false;
                }

                String poppedStr = stack.pop();
                char poppedChar = poppedStr.charAt(0);

                if (!isMatchingPair(poppedChar, ch)) {
                    return false; 
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "((a + b) * [c - d])";

        System.out.println("Expression 1: " + expression1 + " is balanced? " + isBalanced(expression1));
        System.out.println("Expression 2: " + expression2 + " is balanced? " + isBalanced(expression2));
        System.out.println("Expression 3: " + expression3 + " is balanced? " + isBalanced(expression3));
    }
}