import java.util.Stack;

class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        int n = expression.length();

        for (int i = 0; i < n; i++) {
            char ch = expression.charAt(i);

            if (ch == 't' || ch == 'f' || ch == '!' || ch == '&' || ch == '|') {
                stack.push(ch);
            } else if (ch == '(') {
                continue;
            } else if (ch == ')') {
                Stack<Boolean> temp = new Stack<>();
                
                while (stack.peek() != '!' && stack.peek() != '&' && stack.peek() != '|') {
                    temp.push(stack.pop() == 't');
                }

                char operator = stack.pop();
                boolean result = (operator == '&');
                if (operator == '|') {
                    result = false;
                }

                while (!temp.isEmpty()) {
                    boolean value = temp.pop();
                    if (operator == '&') {
                        result = result && value;
                    } else if (operator == '|') {
                        result = result || value;
                    } else if (operator == '!') {
                        result = !value;
                    }
                }

                stack.push(result ? 't' : 'f');
            }
        }

        return stack.pop() == 't';
    }
}
