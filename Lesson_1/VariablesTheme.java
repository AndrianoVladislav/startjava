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
        short firstProduct = 100;
        short secondProduct = 200;
        float discount = 0.11f;
        int sumXY = firstProduct + secondProduct;
        discount = sumXY * discount;
        float result = sumXY - discount;
        System.out.println("Сумма скидки " + discount);
        System.out.println("Стоимость товаров со скидкой " + result);

        //Вывод на консоль слова JAVA
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
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
        System.out.println(++numberByte);
        System.out.println(++numberShort);
        System.out.println(++numberInt);
        System.out.println(++numberLong);
        System.out.println("Декрементированые");
        System.out.println(--numberByte);
        System.out.println(--numberShort);
        System.out.println(--numberInt);
        System.out.println(--numberLong);

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
        System.out.println(code1 + " = " + (char) code1) ;
        System.out.println(code2 + " = " + (char) code2);
        System.out.println(code3 + " = " + (char) code3);
        System.out.println(code4 + " = " + (char) code4);
        System.out.println(code5 + " = " + (char) code5);

        //Произведение и сумма цифр числа
        System.out.println("\n7. Произведение и сумма цифр числа");
        int srcNumber = 345;
        int number1 = srcNumber / 100;
        int number2 = srcNumber / 10 % 10;
        int number3 = srcNumber % 10;
        int result1 = number1 * number2 * number3;
        int result2 = number1 + number2 + number3;
        System.out.println(result1 + " Произведение");
        System.out.println(result2 + " Сумма");

        //Преобразование секунд
        System.out.println("\n10. Преобразование секунд");
        int time = 86399;
        int timeHour = time / 3600;
        time = time - timeHour * 3600;
        int timeMinute = time / 60;
        time = time - timeMinute * 60;
        System.out.println(timeHour + ":" + timeMinute + ":" + time);
    }
}