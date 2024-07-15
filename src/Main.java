import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(isValid("()"));         // true
        System.out.println(isValid("()[]{}"));     // true
        System.out.println(isValid("(]"));         // false
        System.out.println(isValid("([)]"));       // false
        System.out.println(isValid("{[]}"));       // true
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();


        for (char ch : charArray) {

            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
                continue;
            } else {
                if (stack.empty()) {
                    return false;
                }

                char top = stack.pop(); // Remove o elemento do topo
                if ((ch == ']' && top != '[') ||
                        (ch == '}' && top != '{') ||
                        (ch == ')' && top != '(')) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}