public class CyclesTheme  { 
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int a = 1;
        int result = 0;
        do {
            result = result + i;
            System.out.println(a + " = " + result);
            i++;
            a++;
        } while (i != 21);
        System.out.println("Сумма чисел = " + result);

        //Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min");
        int[] firstArray = {10, 5, -1};
        int max = -999999;
        for (int t = 0; t <= 2; t++) {
            if (firstArray[t] > max){
                max = firstArray[t];
            }
        }
        int min = 9999999;
        for (int x = 0; x <= 2; x++) {
            if (firstArray[x] < min){
                min = firstArray[x];
            }
        }
        for (int r = min; r <= max; r++) {
            System.out.println(r);
        }

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int h = 0;
        int number = 1234;
        int[] secondArray = new int[4];
        while (h != 4){
            secondArray[h] = number % 10;
            number = number / 10;
            System.out.print(secondArray[h]);
            h++;
        }
        int sum = 0;
        for (int u = 0; u != 4; u++){
            sum = sum + secondArray[u];
        }
        System.out.println(" - число \nСумма цифр = " + sum);

        //Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int o = 1; o < 30; o = o + 2){
            if (o < 24){
                if (o < 10){
                    System.out.print(o + "  ");
                } else{
                    System.out.print(o + " ");
                }
            if (o == 9){
                    System.out.print("\n");
                } else if (o == 19){
                    System.out.print("\n");
                }
            } else {
                System.out.print("0  ");
            }
        }

        //Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        int srcNumber5 = 3141591;
        int parameter = 0;
        int k = 0;
        int counter = 0;
        while(k != 7){
            counter = srcNumber5 % 10;
            srcNumber5 = (int) srcNumber5 /10;
            if (counter == 1){
                parameter = parameter + 1;
            }
            k++;
        }
        System.out.println("Количество единиц = " + parameter);
        if (parameter % 2 == 0){
            System.out.println("Количество единиц является четным");
        } else {
            System.out.println("Количество единиц является нечетным");
        }

        //Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        char symbol61 = '\u002A';
        for (int l = 1; l != 51; l++){
            System.out.print(symbol61);
            if ((l == 10) || (l == 20) || (l == 30) || (l == 40) || (l == 50)){
                System.out.print("\n");
            }
        }
        char symbol62 = '\u0023';
        int n = 1;
        while (n != 16){
            System.out.print(symbol62);
            if ((n == 5) || (n == 9) || (n == 12) || (n == 14) || (n == 15)){
                System.out.print("\n");
            }
            n++;
        }
        char symbol63 = '\u0024';
        int m = 1;
        do {
            System.out.print(symbol63);
            if ((m == 1) || (m == 3) || (m == 6) || (m == 8) || (m == 9)){
                System.out.print("\n");
            }
            m++;
        } while (m != 10);

        //Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        char srcSymbol = 0;
        System.out.println("Dec Char");
        for (int g = 1; g != 49; g = g + 2){
            srcSymbol =(char) g;
            if (g < 10){
                System.out.println(g +"   " + srcSymbol);
            } else {
                System.out.println(g +"  " + srcSymbol);
            }
        }
        for (int z = 97; z != 123; z = z + 2){
            srcSymbol =(char) z;
            if (z < 100){
                System.out.println(z +"  " + srcSymbol);
            } else {
                System.out.println(z +" " + srcSymbol);
            }
        }

        //Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int[] thirdArray = new int[7];
        int srcNumber8 = 1234321;
        int reserve = srcNumber8;
        int r = 0;
        while (r != 7){
            thirdArray[r] = srcNumber8 % 10;
            srcNumber8 = srcNumber8 / 10;
            r++;
        }
        int counter8 = 1000000;
        int result8 = 0;
        while (r != 0){
            r--;
            result8 = result8 + (thirdArray[r] * counter8);
            counter8 = counter8 / 10;
        }
        if (reserve == result8){
            System.out.println("Число 1234321 является палиндромом");
        } else {
            System.out.println("Число 1234321 неявляется палиндромом");
        }

        //Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");
        int[] fourthArray = new int[6];
        int srcNumber9 = 123456;
        int p = 0;
        while (p != 6){
            fourthArray[p] = srcNumber9 % 10;
            srcNumber9 = srcNumber9 / 10;
            p++;
        }
        p = 0;
        int result91 = 0;
        while (p != 3){
            result91 = result91 + fourthArray[p];
            p++;
        }
        int result92 = 0;
        while (p != 6){
            result92 = result92 + fourthArray[p];
            p++;
        }
        System.out.println(fourthArray[0] + "" + fourthArray[1] + "" + fourthArray[2] + " = " + result91);
        System.out.println(fourthArray[3] + "" + fourthArray[4] + "" + fourthArray[5] + " = " + result92);
        if (result91 == result92){
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
        for(int b = 0; b != 8; b++) {
            System.out.print(one + " | ");
            if (b == 0){
                System.out.print(" 4  6  ");
                two = 4;
                for (int e = 0; e != 6; e++){
                    result10 = one * two;
                    two++;
                    System.out.print(result10 + " ");
                }
            } else if (b == 1){
                System.out.print(" 6  ");
                two = 3;
                for (int e = 0; e != 7; e++){
                    result10 = one * two;
                    two++;
                    System.out.print(result10 + " ");
                }
            } else if (b == 2){
                System.out.print(" ");
                for (int e = 0; e != 8; e++){
                    result10 = one * two;
                    two++;
                    System.out.print(result10 + " ");
                }
            } else {
                for (int e = 0; e != 8; e++){
                    result10 = one * two;
                    two++;
                    System.out.print(result10 + " ");
                }
            }
            two = 2;
           System.out.print("\n");
           one++;
        }






    }
}