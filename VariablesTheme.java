import java.lang.String;

public class VariablesTheme { 
    public static void main(String[] args) {

            //Создание переменных и вывод их значений на консоль
            System.out.println("Создание переменных и вывод их значений на консоль");
        byte core = 2;
        short proce = 4;
        int memory = 8;
        long hdd = 1000;
        float cpumin = 2.00f;
        double cpumax = 3.10d;
        char cpuname = 'i';
        boolean turbobo = true;

        System.out.println(core + " ядра"); 
        System.out.println(proce + " потока");
        System.out.println(memory + " Гигабайт Оперативной памяти ");
        System.out.println(hdd + " Гигабайт Постоянной памяти");
        System.out.println(cpumin + " GHz минимум");
        System.out.println(cpumax + " GHz в Turbo Boost");
        System.out.println(cpuname + "7 3 поколения");
        System.out.println("Turbo Boost " + turbobo);

            //Расчет стоимости товара со скидкой
            System.out.println("");
            System.out.println("Расчет стоимости товара со скидкой");
        short x1 = 100;
        short y1 = 200;
        float skyd = 0.11f;

        int sumXY = x1 + y1;
        float sumskydf = sumXY * skyd;
        int sumskyd = (int) sumskydf;
        int result = sumXY - sumskyd;
        System.out.println("Сумма скидки " + sumskyd);
        System.out.println("Стоимость товаров со скидкой " + result);

            //Вывод на консоль слова JAVA
            System.out.println("");
            System.out.println("Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("   JJ  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

//Отображение min и max значений числовых типов данных
            System.out.println("");
            System.out.println("Отображение min и max значений числовых типов данных");
        byte nambb = 127;
        short nambs = 32767;
        int nambi = 2147483647;
        long nambl = 9223372036854775807L;

        System.out.println(nambb);
        System.out.println(nambs);
        System.out.println(nambi);
        System.out.println(nambl);

        System.out.println("Инкрементированые");
        nambb++;
        nambs++;
        nambi++;
        nambl++;
        System.out.println(nambb);
        System.out.println(nambs);
        System.out.println(nambi);
        System.out.println(nambl);

        System.out.println("Декрементированые");
        nambb--;
        nambs--;
        nambi--;
        nambl--;
        System.out.println(nambb);
        System.out.println(nambs);
        System.out.println(nambi);
        System.out.println(nambl);

//Перестановка значений переменных
            System.out.println("");
            System.out.println("Перестановка значений переменных");
        float o1 = 1.11f;
        float t2 = 2.22f;
        System.out.println("1. 1 переменная = " + o1);
        System.out.println("2. 2 переменная= " + t2);

        float th3 = o1;
        o1 = t2;
        t2 =th3;
        System.out.println("3. 1 переменная = " + o1);
        System.out.println("4. 2 переменная = " + t2);

//Вывод символов и их кодов
            System.out.println("");
            System.out.println("Вывод символов и их кодов");
        int h1 = 35;
        int h2 = 38;
        int h3 = 64;
        int h4 = 94;
        int h5 = 95;
        char k1 = 35;
        char k2 = 38;
        char k3 = 64;
        char k4 = 94;
        char k5 = 95;
        System.out.println(h1 + " = " + k1);
        System.out.println(h2 + " = " + k2);
        System.out.println(h3 + " = " + k3);
        System.out.println(h4 + " = " + k4);
        System.out.println(h5 + " = " + k5);

//Произведение и сумма цифр числа
            System.out.println("");
            System.out.println("Произведение и сумма цифр числа");
        int nam = 345;
        float nam1 = nam % 10;
        int nam11 = (int) nam1;
        float nam2 = nam / 10;
        float nam22 = nam2 % 10;
        float nam3 = nam / 100;
        int nam222 = (int) nam22;
        int nam33 = (int) nam3;
        int re1 = nam11 * nam222 * nam33;
        int re2 = nam11 + nam222 + nam33;
        System.out.println(re1 + " Произведение");
        System.out.println(re2 + " Сумма");

//Преобразование секунд
            System.out.println("");
            System.out.println("Преобразование секунд");
        int tim = 86399;
        float timh = tim / 3600;
        int timh1 = (int) timh;
        int timh2 = timh1 * 3600;
        tim = tim - timh2;
        float timm = tim / 60;
        int timm1 = (int) timm;
        int timm2 = timm1 * 60;
        tim = tim - timm2;
        System.out.println(timh1 + ":" + timm1 + ":" + tim);
    }
}