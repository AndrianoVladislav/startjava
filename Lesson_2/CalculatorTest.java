import java.util.Scanner;

public class CalculatorTest { 
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите первое число: ");
            int a = console.nextInt();
            calculator.setNum1(a);
            System.out.println("Введите знак математической операции: ");
            char sign = console.next().charAt(0);
            calculator.setMathSign(sign);
            System.out.println("Введите второе число: ");
            int b = console.nextInt();
            calculator.setNum2(b);
            calculator.calculate();
            System.out.format(a + " " + sign + " " + b + " = " + "%1$-10.2f%n", calculator.getResult());
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            console.nextLine();
            while (!answer.equals("no")) {
                answer = console.nextLine();
                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    break;
                } else {
                    System.out.println("Недопустимое значение");
                }
            }
        }
    }
}