package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {

        String[] expressions = expression.split(" ");
        double result = 0;
        try {
            int num1 = Integer.parseInt(expressions[0]);
            char mathSign = expressions[1].charAt(0);
            int num2 = Integer.parseInt(expressions[2]);
            switch (mathSign) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result =(double) num1 / num2;
                case '%' -> result = num1 % num2;
                case '^' -> result = Math.pow(num1, num2);
                default -> System.out.println("Мат. операция не найдена");
            }
        } catch (NumberFormatException e) {
            System.out.println("Программа работает только с целыми числами");
        }
        return result;
    }
}