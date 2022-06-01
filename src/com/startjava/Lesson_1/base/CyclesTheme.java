package com.startjava.Lesson_1.base;

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
        int srcNumber = 1234;
        int digit = 0;
        int sumDigits = 0;
        while (srcNumber != 0) {
            digit = srcNumber % 10;
            sumDigits += digit;
            srcNumber /= 10;
            System.out.print(digit);
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
            } else if (i > 24) {
                System.out.format("%3d", 0);
            }
        }

        //Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        int countUnits = 0;
        srcNumber = 3141591;
        digit = 0;
        while(srcNumber != 0) {
            digit = srcNumber % 10;
            srcNumber /= 10;
            if (digit == 1) {
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
        int countColumns = 6;
        for (int i = 1; i != 6; i++) {
            for (int j = 1; j != countColumns; j++) {
                System.out.print("#");
            }
            System.out.println("");
            countColumns--;
        }
        countColumns = 1;
        for (int i = 1; i != 6; i++) {
            for (int j = 0; j != countColumns; j++) {
                System.out.print("$");
            }
            System.out.println("");
            if (i < 3) {
                countColumns++;
            } else {
                countColumns--;
            }
        }

        //Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i = 1; i != 49; i += 2) {
            System.out.format("%-3d %-3c%n", i, i);
        }
        for (int i = 97; i != 123; i = i + 2) {
            System.out.format("%-3d %-3c%n", i, i);
        }

        //Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        countUnits = 1000000;
        srcNumber = 1234321;
        digit = 0;
        int reserveSrcNumber = srcNumber;
        while (srcNumber != 0) {
            digit += (srcNumber % 10) * countUnits;
            srcNumber /= 10;
            countUnits /= 10;
        }
        if (reserveSrcNumber == digit) {
            System.out.println("Число 1234321 является палиндромом");
        } else {
            System.out.println("Число 1234321 неявляется палиндромом");
        }

        //Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");
        srcNumber = 123456;
        digit = 0;
        number1 = 0;
        int sumNumber1 = 0;
        number2 = 0;
        int sumNumber2 = 0;
        countUnits = 100;
        for (int i = 1; i <= 6; i++) {
            digit = srcNumber % 10;
            srcNumber /= 10;
            if (i <= 3) {
                number1 += digit * countUnits;
                sumNumber1 += digit;
            } else {
                number2 += digit * countUnits;
                sumNumber2 += digit;
            }
            countUnits /= 10;
            if (i == 3) {
                countUnits = 100;
            }
        }
        System.out.println(number1 + " = " + sumNumber1);
        System.out.println(number2 + " = " + sumNumber2);
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