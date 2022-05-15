public class Calculator { 

    private double num1;
    private double num2;
    private double result;
    private char mathSign;

    public double getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public double getResult() {
        return result;
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
                result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Мат. операция не найдена");
        }
    }
}