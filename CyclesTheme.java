public class CyclesTheme { 
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int x = -10;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (x % 2 == 0) {
                sumOdd += x;
            } else {
                sumEven += x;
            }
            x++;
        } while (x < 22);
        System.out.println("Сумма четных чисел = " + sumOdd);
        System.out.println("Сумма нечетных чисел = " + sumEven);

        //Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = 0;
        if ((number1 > number2) && (number1 > number3)) {
            max = number1;
        } else if ((number2 > number1) && (number2 > number3)) {
            max = number2;
        } else {
            max = number3;
        }
        int min = 0;
        if ((number1 < number2) && (number1 < number3)) {
            min = number1;
        } else if ((number2 < number1) && (number2 < number3)) {
            min = number2;
        } else {
            min = number3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.println(i);
        }

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int digit1Task3 = 1234;
        int digit2Task3 = 0;
        int sumDigits = 0;
        while (digit1Task3 != 0) {
            digit2Task3 = digit1Task3 % 10;
            sumDigits += digit2Task3;
            digit1Task3 /= 10;
            System.out.print(digit2Task3);
        }
        System.out.print(" = исходное число в обратном порядке\n");
        System.out.println(sumDigits + " = сумма цифр");

        //Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int i = 1; i < 30; i += 2) {
            if (i < 24) {
                if (i % 10 == 1) {
                    System.out.print("\n");
                }
            System.out.format("%3d", i);
            } else if (i >24) {
                System.out.format("%3d", 0);
            }
        }

        //Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        int digit1Task5 = 3141591;
        int countUnits = 0;
        int digit2Task5 = 0;
        while(digit1Task5 != 0) {
            digit2Task5 = digit1Task5 % 10;
            digit1Task5 /= 10;
            if (digit2Task5 == 1) {
                countUnits++;
            }
        }
        System.out.println("Количество единиц = " + countUnits);
        if (countUnits % 2 == 0) {
            System.out.println("Количество единиц является четным");
        } else {
            System.out.println("Количество единиц является нечетным");
        }

        //Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 1; i != 6; i++) {
            for (int j = 1; j != 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int countUnits6 = 6;
        for (int i = 1; i != 6; i++) {
            for (int j = 1; j != countUnits6; j++) {
                System.out.print("#");
            }
            System.out.println("");
            countUnits6--;
        }
        int countUnits62 = 1;
        for (int i = 1; i != 6; i++) {
            for (int j = 0; j != countUnits62; j++) {
                System.out.print("$");
            }
            System.out.println("");
            if (i < 3) {
                countUnits62++;
            } else {
                countUnits62--;
            }
        }

        //Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i = 1; i != 49; i = i + 2) {
                System.out.format("%-4d", i);
                System.out.println((char) i);
        }
        for (int i = 97; i != 123; i = i + 2) {
                System.out.format("%-4d", i);
                System.out.println((char) i);
        }

        //Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNumberTask8 = 1234321;
        int reserve = srcNumberTask8;
        int digit1Task8 = 0;
        int digit2Task8 = 0;
        int srcNumber2Task8 = 1000000;
        while (srcNumberTask8 != 0) {
            digit1Task8 = srcNumberTask8 % 10;
            digit2Task8 += digit1Task8 * srcNumber2Task8;
            srcNumberTask8 /= 10;
            srcNumber2Task8 /= 10;
        }
        if (reserve == digit2Task8) {
            System.out.println("Число 1234321 является палиндромом");
        } else {
            System.out.println("Число 1234321 неявляется палиндромом");
        }

        //Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");
        int srcNumber9 = 123456;
        int digit9 = 0;
        int number91 = 0;
        int sumNumber1 = 0;
        int number92 = 0;
        int sumNumber2 = 0;
        int srcNumber92 = 100;
        for (int i = 0; i < 6; i++) {
            digit9 = srcNumber9 % 10;
            srcNumber9 /= 10;
            if (i < 3) {
                number91 += digit9 * srcNumber92;
                sumNumber1 += digit9;
            } else {
                number92 += digit9 * srcNumber92;
                sumNumber2 += digit9;
            }
            srcNumber92 /= 10;
            if (i == 3) {
                srcNumber92 = 100;
            }
        }
        System.out.println(number91 + " = " + sumNumber1);
        System.out.println(number92 + " = " + sumNumber2);
        if (sumNumber1 == sumNumber2) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число несчастливое");
        }

         //Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("  Таблица Пифагора");
        System.out.println("  |  2  3  4  5  6  7  8  9");
        System.out.println("___________________________");
        for(int i = 2; i <= 9; i++) {
            System.out.print(i + " |");
                for (int j = 2; j <= 9; j++) {
                    System.out.format("%1$3d", i * j);
                }
            System.out.print("\n");
        }
    }
}