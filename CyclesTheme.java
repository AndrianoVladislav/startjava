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
        int number21 = 10;
        int number22 = 5;
        int number23 = -1;
        int max = 0;
        if ((number21 > number22) && (number21 > number23)) {
            max = number21;
        } else if ((number22 > number21) && (number22 > number23)) {
            max = number22;
        } else {
            max = number23;
        }
        int min = 0;
        if ((number21 < number22) && (number21 < number23)) {
            min = number21;
        } else if ((number22 < number21) && (number22 < number23)) {
            min = number22;
        } else {
            min = number23;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.println(i);
        }

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int srcNumber31 = 0;
        int sumNumber = 0;
        while (srcNumber != 0) {
            srcNumber31 = srcNumber % 10;
            sumNumber += srcNumber31;
            srcNumber /= 10;
            System.out.print(srcNumber31);
        }
        System.out.print(" = исходное число в обратном порядке\n");
        System.out.println(sumNumber + " = сумма цифр");

        //Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int i = 1; i < 24; i += 2) {
            if (i % 10 == 1) {
                System.out.print("\n");
            }
            System.out.format("%3d", i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.format("%3d", 0);
        }

        //Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        int srcNumber5 = 3141591;
        int countUnits = 0;
        int digit = 0;
        while(srcNumber5 != 0) {
            digit = srcNumber5 % 10;
            srcNumber5 /= 10;
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
        char symbol61 = '\u002A';
        for (int i = 1; i != 6; i++) {
            for (int j = 1; j != 10; j++) {
            System.out.format("%1$-1s", symbol61);
            }
        System.out.println("");
        }
        char symbol62 = '\u0023';
        int countUnits6 = 6;
        for (int i = 1; i != 6; i++) {
            for (int j = 1; j != countUnits6; j++) {
            System.out.format("%1$-1s", symbol62);
            }
            System.out.println("");
            countUnits6--;
        }
        char symbol63 = '\u0024';
        int countUnits62 = 1;
        for (int i = 1; i != 6; i++) {
            for (int j = 0; j != countUnits62; j++) {
            System.out.format("%1$-1s", symbol63);
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
        char srcSymbol = 0;
        System.out.println("Dec Char");
        for (int i = 1; i != 49; i = i + 2) {
            srcSymbol =(char) i;
            if (i < 10) {
                System.out.println(i +"   " + srcSymbol);
            } else {
                System.out.println(i +"  " + srcSymbol);
            }
        }
        for (int i = 97; i != 123; i = i + 2) {
            srcSymbol =(char) i;
            if (i < 100) {
                System.out.println(i +"  " + srcSymbol);
            } else {
                System.out.println(i +" " + srcSymbol);
            }
        }

        //Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNumber8 = 1234321;
        int reserve = srcNumber8;
        int srcNumber81 = 0;
        int srcNumber82 = 0;
        int digit8 = 1000000;
        while (srcNumber8 != 0) {
            srcNumber81 = srcNumber8 % 10;
            srcNumber82 += srcNumber81 * digit8;
            srcNumber8 /= 10;
            digit8 /= 10;
        }
        if (reserve == srcNumber82) {
            System.out.println("Число 1234321 является палиндромом");
        } else {
            System.out.println("Число 1234321 неявляется палиндромом");
        }

        //Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");
        int srcNumber9 = 123456;
        int p = 0;
        int srcNumber91 = 0;
        int srcNumber92 = 0;
        int srcNumber93 = 0;
        int srcNumber94 = 0;
        int srcNumber95 = 0;
        int digit91 = 100;
        int digit92 = 100;
        while (p != 3) {
            srcNumber91 = srcNumber9 % 10;
            srcNumber92 += srcNumber91 * digit91;
            srcNumber93 += srcNumber91;
            digit91 /= 10;
            srcNumber9 /= 10;
            p++;
        }
        while (p != 6) {
            srcNumber91 = srcNumber9 % 10;
            srcNumber94 += srcNumber91 * digit92;
            srcNumber95 += srcNumber91;
            digit92 /= 10;
            srcNumber9 /= 10;
            p++;
        }
        System.out.println(srcNumber92 + " = " + srcNumber93);
        System.out.println(srcNumber94 + " = " + srcNumber95);
        if (srcNumber93 == srcNumber95) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число несчастливое");
        }

         //Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("  Таблица Пифагора");
        int one = 2;
        int two = 2;
        int result10 = 0;
        System.out.println("  |  2  3  4  5  6  7  8  9");
        System.out.println("___________________________");
        for(int i = 0; i != 8; i++) {
            System.out.print(one + " |");
                for (int j = 0; j != 8; j++) {
                    result10 = one * two;
                    two++;
                    System.out.format("%1$3d", result10);
                }
            two = 2;
            System.out.print("\n");
            one++;
        }
    }
}