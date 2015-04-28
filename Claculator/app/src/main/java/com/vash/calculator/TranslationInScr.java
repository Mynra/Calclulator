package com.vash.calculator;

import java.util.Stack;

public class TranslationInScr {
    public static String inPolishNotation(String expression) {
        expression = "(" + expression;
        expression += ")";
        String rezNotation = "";
        Stack <Character>stack = new Stack<>() ;
        Stack <Character>outString = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if ((expression.charAt(i) == '+') || (expression.charAt(i) == '-')
                    || (expression.charAt(i) == '/') || (expression.charAt(i) == '*')
                    || (expression.charAt(i) == '^')) {
                if (stack.size() == 0) {
                    stack.push(expression.charAt(i));
                } else if (priority(expression.charAt(i)) > priority(String
                        .valueOf(stack.peek()).charAt(0))) {
                    stack.push(expression.charAt(i));
                } else {
                    while ((stack.size() != 0)
                            && (priority(String.valueOf(stack.peek()).charAt(0)) >= priority(expression
                            .charAt(i)))) {
                        outString.push(stack.pop());
                    }
                    stack.push(expression.charAt(i));
                }
            } else if (expression.charAt(i) != '(' && expression.charAt(i) != ')')
                outString.push(expression.charAt(i));

            if (expression.charAt(i) == ')') {
                while (String.valueOf(stack.peek()).charAt(0) != '(') {
                    outString.push(stack.pop());
                }

                stack.pop();
            }
            if (expression.charAt(i) == '(') {
                stack.push('(');
            }
        }
        for (int j = 0; j < outString.size(); j++) {
            rezNotation = rezNotation + String.valueOf(outString.get(j));
        }
        return rezNotation;
    }

    private static int priority(final char operator) {
        switch (operator) {
            case '^':
                return 4;
            case '*':
                return 3;
            case '/':
                return 3;
            case '-':
                return 2;
            case '+':
                return 2;
            case '(':
                return 1;
        }
        return 0;
    }
}