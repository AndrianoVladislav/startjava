public class Calculator { 
    public static void main(String[] args) {
        int variable1 = 6;
        int variable2 = 4;
        char symbolPlus = '\u002B';
        char symbolMinus = '\u002D';
        char symbolMultiply = '\u002A';
        char symbolDivide  = '\u002F';
        char symbol5 = '\u0025';
        char symbol6 = '\u005E';
        int sign = symbol6;
        if (sign == symbolPlus) {
            System.out.println(variable1 + " " + symbolPlus + " " + variable2 + " = " + (variable1 + variable2));
        } else if (sign == symbolMinus) {
            System.out.println(variable1 + " " + symbolMinus + " " + variable2 + " = " + (variable1 - variable2));
        } else if (sign == symbolMultiply) {
            System.out.println(variable1 + " " + symbolMultiply + " " + variable2 + " = " + (variable1 * variable2));
        } else if (sign == symbolDivide ) {
            float variable11 = (float) variable1;
            float variable21 = (float) variable2;
            System.out.format(variable1 + " " + symbolDivide  + " " + variable2 + " = " + "%1$-10.2f", (variable11 / variable21));
        } else if (sign == symbol5) {
            System.out.println(variable1 + " " + symbol5 + " " + variable2 + " = " + (variable1 % variable2));
        } else if (sign == symbol6) {
            int result = 1;
            for (int i = 1; i <= variable2; i++) {
                result *= variable1;
            }
            System.out.println(variable1 + " " + symbol6 + " " + variable2 + " = " + result);
        }
    }
}