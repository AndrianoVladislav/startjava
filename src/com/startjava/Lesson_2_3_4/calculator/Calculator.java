package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        char mathSign = partsExpression[1].charAt(0);
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = Integer.parseInt(partsExpression[0]);
            num2 = Integer.parseInt(partsExpression[2]);
        } catch (NumberFormatException e) {
            System.out.println("Программа работает только с целыми числами");
        }
        return switch (mathSign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' ->  (double) num1 / num2;
            case '%' ->  num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> throw new IllegalArgumentException("Операция " + mathSign + " не поддерживается");
        };
    }
}