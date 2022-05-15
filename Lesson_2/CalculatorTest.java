import java.util.Scanner;

public class CalculatorTest { 
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите первое число: ");
            int a = console.nextInt();
            calculatorOne.setNum1(a);
            System.out.println("Введите знак математической операции: ");
            char sign = console.next().charAt(0);
            calculatorOne.setMathSign(sign);
            System.out.println("Введите второе число: ");
            int b = console.nextInt();
            calculatorOne.setNum2(b);
            calculatorOne.calculate();
            System.out.format(a + " " + sign + " " + b + " = " + "%1$-10.2f%n", calculatorOne.getResult());
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            console.nextLine();
            answer = console.nextLine();
            while (!answer.equals("yes")) {
                if (answer.equals("no")) {
                    break;
                } else {
                    System.out.println("Недопустимое слово");
                }
                answer = console.nextLine();
            }
        }
    }
}