package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {

    private double result;

    public double calculate(String expression) {
        String[] expressions = expression.split(" ");
        double num1 = Double.parseDouble(expressions[0]);
        char mathSign = expressions[1].charAt(0);
        double num2 = Double.parseDouble(expressions[2]);
        switch(mathSign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^' :
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Мат. операция не найдена");
        }
        return result;
    }
}