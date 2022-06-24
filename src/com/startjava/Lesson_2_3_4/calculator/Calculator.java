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
        switch (mathSign) {
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                return (double) num1 / num2;
            }
            case '%' -> {
                return num1 % num2;
            }
            case '^' -> {
                return Math.pow(num1, num2);
            }
            default -> System.out.println("Операция " + mathSign + " не поддерживается");
        }
        return 0;
    }
}