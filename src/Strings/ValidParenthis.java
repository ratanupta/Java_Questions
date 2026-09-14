package Strings;

public class ValidParenthis {
    public static void main(String[] args) {
        ValidParenthis validParenthis = new ValidParenthis();
        String s = "()[]";
        boolean result = validParenthis.isValid(s);
        System.out.println(result); // Output: false
    }

    public boolean isValid(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
