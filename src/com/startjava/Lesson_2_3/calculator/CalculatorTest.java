package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

import java.util.Arrays;

public class CalculatorTest { 
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите выражение: ");
            String expression = console.nextLine();
            calculator.setExpressions(expression.split(" "));
            calculator.doArrays();
            calculator.calculate();
            System.out.format(calculator.getNum1() + " " + calculator.getMathSign() + " " + calculator.getNum2() +
                    " = " + "%1$-10.2f%n", calculator.getResult());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = console.nextLine();
            } while (!"no".equals(answer) && !"yes".equals(answer));
        }
    }
}