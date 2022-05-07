public class Calculator { 
    public static void main(String[] args) {
        double num1 = 6.5;
        double num2 = 4.5;
        double result = 0;
        char symbol = '^';
        int sign = symbol;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/' ) {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        } else if (sign == '^') {
            result += 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        }
        System.out.format(num1 + " " + symbol + " " + num2 + " = " + "%1$-10.2f", result);
    }
}