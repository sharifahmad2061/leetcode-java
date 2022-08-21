package com.ahmad;

import java.util.Stack;

public class ValidParentheses {
    private char opposite(char c) {
        if (c == ')')
            return '(';
        else if (c == '}')
            return '{';
        else if (c == ']')
            return '[';
        else
            return 'i';
    }

    public boolean isValid(String s) {
        if (s.isEmpty())
            return false;
        Stack<Character> brackets = new Stack<Character>();
        for (char bracket : s.toCharArray()) {
            if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (brackets.isEmpty() || brackets.peek() != opposite(bracket))
                    return false;
                else
                    brackets.pop();
            } else if (bracket == '(' || bracket == '{' || bracket == '[') {
                brackets.push(bracket);
            } else
                return false; // invalid character
        }
        if (!brackets.isEmpty())
            return false; // if an opening bracket is last parenthesis
        return true;
    }
}
