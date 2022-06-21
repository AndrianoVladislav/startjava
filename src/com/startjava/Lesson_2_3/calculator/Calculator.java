package com.startjava.Lesson_2_3.calculator;

public class Calculator { 

    private double num1;
    private double num2;
    private double result;
    private char mathSign;
    private String[] expressions = new String[3];

    public void setExpressions(String[] expressions) {
        this.expressions = expressions;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public char getMathSign() {
        return mathSign;
    }

    public double getResult() {
        return result;
    }

    public void doArrays() {
        num1 = Double.parseDouble(expressions[0]);
        mathSign = expressions[1].charAt(0);
        num2 = Double.parseDouble(expressions[2]);
    }

    public void calculate() {
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
    }
}