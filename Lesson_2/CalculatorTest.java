import java.util.Scanner;

public class CalculatorTest { 
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner entry = new Scanner(System.in);
        String question = "yes";
        while (question.equals("yes")) {
            System.out.println("Введите первое число: ");
            int a = entry.nextInt();
            System.out.println("Введите знак математической операции: ");
            char sign = entry.next().charAt(0);
            System.out.println("Введите второе число: ");
            int b = entry.nextInt();
            calculatorOne.setNum1(a);
            calculatorOne.setSymbol(sign);
            calculatorOne.setNum2(b);
            calculatorOne.count();
            System.out.format(calculatorOne.getNum1() + " " + calculatorOne.getSymbol() + " " + calculatorOne.getNum2() + " = " + "%1$-10.2f%n", calculatorOne.getResult());
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            question = entry.nextLine();
            question = entry.nextLine();
            while (true) {
                if (question.equals("yes")) {
                    break;
                } else if (question.equals("no")) {
                    break;
                } else {
                    System.out.println("Недопустимое слово");
                }
                question = entry.nextLine();
            }
        }
    }
}

// || (question2.equals("yes"))