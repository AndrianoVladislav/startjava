public class VariablesTheme { 
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");
        byte core = 2;
        short cpu = 4;
        int memory = 8;
        long hdd = 1000;
        float cpuMin = 2.00f;
        double cpuMax = 3.10d;
        char cpuName = 'i';
        boolean turbuBoost = true;
        System.out.println(core + " ядра"); 
        System.out.println(cpu + " потока");
        System.out.println(memory + " Гигабайт Оперативной памяти ");
        System.out.println(hdd + " Гигабайт Постоянной памяти");
        System.out.println(cpuMin + " GHz минимум");
        System.out.println(cpuMax + " GHz в Turbo Boost");
        System.out.println(cpuName + "7 3 поколения");
        System.out.println("Turbo Boost " + turbuBoost);

        //Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        short x1 = 100;
        short y1 = 200;
        float skyd = 0.11f;
        int sumXY = x1 + y1;
        float discount1 = sumXY * skyd;
        int discount = (int) discount1;
        int result = sumXY - discount;
        System.out.println("Сумма скидки " + discount);
        System.out.println("Стоимость товаров со скидкой " + result);

        //Вывод на консоль слова JAVA
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("   JJ  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        //Отображение min и max значений числовых типов данных
        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte numberByte = 127;
        short numberShort = 32767;
        int numberInt = 2147483647;
        long numberLong = 9223372036854775807L;
        System.out.println(numberByte);
        System.out.println(numberShort);
        System.out.println(numberInt);
        System.out.println(numberLong);
        System.out.println("Инкрементированые");
        numberByte++;
        numberShort++;
        numberInt++;
        numberLong++;
        System.out.println(numberByte);
        System.out.println(numberShort);
        System.out.println(numberInt);
        System.out.println(numberLong);
        System.out.println("Декрементированые");
        numberByte--;
        numberShort--;
        numberInt--;
        numberLong--;
        System.out.println(numberByte);
        System.out.println(numberShort);
        System.out.println(numberInt);
        System.out.println(numberLong);

        //Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        float one = 1.11f;
        float two = 2.22f;
        System.out.println("1. 1 переменная = " + one);
       System.out.println("2. 2 переменная= " + two);
        float three = one;
        one = two;
        two =three;
        System.out.println("3. 1 переменная = " + one);
        System.out.println("4. 2 переменная = " + two);

        //Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        int code1 = 35;
        int code2 = 38;
        int code3 = 64;
        int code4 = 94;
        int code5 = 95;
        char symbol1 = 35;
        char symbol2 = 38;
        char symbol3 = 64;
        char symbol4 = 94;
        char symbol5 = 95;
        System.out.println(code1 + " = " + symbol1);
        System.out.println(code2 + " = " + symbol2);
        System.out.println(code3 + " = " + symbol3);
        System.out.println(code4 + " = " + symbol4);
        System.out.println(code5 + " = " + symbol5);

        //Произведение и сумма цифр числа
        System.out.println("\n7. Произведение и сумма цифр числа");
        int number = 345;
        float number1 = number % 10;
        int number11 = (int) number1;
        float number2 = number / 10;
        float number22 = number2 % 10;
        int number222 = (int) number22;
        float number3 = number / 100;
        int number33 = (int) number3;
        int result1 = number11 * number222 * number33;
        int result2 = number11 + number222 + number33;
        System.out.println(result1 + " Произведение");
        System.out.println(result2 + " Сумма");

        //Преобразование секунд
        System.out.println("\n10. Преобразование секунд");
        int time = 86399;
        float timeHour = time / 3600;
        int timeHour1 = (int) timeHour;
        int timeHour2 = timeHour1 * 3600;
        time = time - timeHour2;
        float timeMinute = time / 60;
        int timeMinute1 = (int) timeMinute;
        int timeMinute2 = timeMinute1 * 60;
        time = time - timeMinute2;
        System.out.println(timeHour1 + ":" + timeMinute1 + ":" + time);
    }
}