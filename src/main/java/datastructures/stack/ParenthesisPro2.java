package datastructures.stack;

public class ParenthesisPro2 {

    public static void main(String[] args) {
        System.out.println(isValidSimple("()[]{}"));
        System.out.println(isValidSimple("(])"));
    }

    public static boolean isValidSimple(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }



    public static boolean isValid(String s) {

        if (s.length() == 0 || s.length() == 1 || s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && (c == ')' && stack.peek() == '(' || c == ']' && stack.peek() == '[' || c == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
}
