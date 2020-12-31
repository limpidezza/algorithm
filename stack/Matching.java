package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Matching {
    public static void main(String[] args) {
        System.out.println(match("{{({})}}"));
        System.out.println(match(null));
        System.out.println(match(""));
        System.out.println(match("qwqwq"));
    }

    static Map<Character, Character> map = new HashMap<Character, Character>();

    static {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }

    public static boolean match(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (map.keySet().contains(c)) {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
