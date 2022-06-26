package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest { 
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите выражение: ");
            String expression = console.nextLine();
            System.out.print(expression + " = ");
            try {
                System.out.printf("%1$-10.2f%n",  Calculator.calculate(expression));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = console.nextLine();
            } while (!"no".equals(answer) && !"yes".equals(answer));
        }
    }
}