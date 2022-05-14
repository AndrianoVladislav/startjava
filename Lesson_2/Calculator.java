public class Calculator { 

    private double num1;
    private double num2;
    private double result;
    private char symbol;

    public double getNum1(){
        return num1;
    }

    public void setNum1(float num1){
        this.num1 = num1;
    }

    public double getNum2(){
        return num2;
    }

    public void setNum2(float num2){
        this.num2 = num2;
    }

    public char getSymbol(){
        return symbol;
    }

    public void setSymbol(char symbol){
        this.symbol = symbol;
    }

    public double getResult(){
        return result;
    }

    public void count() {
        switch(symbol) {
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
                result += 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Символ введён неверно");
        }
    }
//        System.out.format(num1 + " " + symbol + " " + num2 + " = " + "%1$-10.2f", result);
}