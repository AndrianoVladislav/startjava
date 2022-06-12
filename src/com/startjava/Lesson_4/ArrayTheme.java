package com.startjava.Lesson_4;

public class ArrayTheme {
    private static int[] numbers;

    private static void outputArray() {
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //1.Реверс значений массива
        System.out.println("1.Реверс значений массива");
        numbers = new int[] {1, 2, 3, 4, 5, 6, 7};
        outputArray();
        int len = numbers.length;
        int temp;
        for (int i = 0; i < len / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[(len - 1) - i];
            numbers[(len - 1) - i] = temp;
        }
        outputArray();

        //2.Вывод произведения элементов массива
        System.out.println("\n2.Вывод произведения элементов массива");
        numbers = new int[10];
        len = numbers.length;
        int product = 1;
        for(int i = 0; i < len; i++) {
            numbers[i] = i;
            if (numbers[i] == (len - 2)) {
                System.out.print(numbers[i] + " = ");
            } else if ((numbers[i] != len - 1) && (numbers[i] != 0)) {
                System.out.print(numbers[i] + " * ");
            }
            product = ((numbers[i] != len - 1) && (numbers[i] != 0)) ? product *= numbers[i] : product;
        }
        System.out.print(product + "\n");
        System.out.print("[" + numbers[0] + "]-" + numbers[0]);
        System.out.print(" [" + numbers[len - 1] + "]-" + numbers[len - 1]);


        //3.Удаление элементов массива
        System.out.println("\n\n3.Удаление элементов массива");
        float[] floatNumbers = new float[15];
        len = floatNumbers.length;
        System.out.println("Исходный массив");
        for(int i = 0; i < len; i++) {
            floatNumbers[i] = (float) Math.random();
            System.out.format("%1$-3d%2$-1.5f%n", i+1, floatNumbers[i]);
        }
        System.out.println("\nИзменённый массив");
        int counter = 0;
        for(int i = 0; i < len; i++) {
            if (floatNumbers[i] > floatNumbers[len / 2]) {
                floatNumbers[i] = 0;
                counter++;
            }
            System.out.format("%1$-3d%2$-1.5f%n", i + 1, floatNumbers[i]);
        }
        System.out.println("Количество обнулённых ячеек = " + counter);

        //4.Вывод элементов массива лесенкой в обратном порядке
        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] Alphabet = new char[26];
        len = Alphabet.length;
        char symbol = 'A';
        for(int i = 0; i < len; i++) {
            Alphabet[i] = symbol;
            symbol++;
        }
        for(int i = 0; i < len; i++) {
            for (int j = len - 1; j >= len - i - 1; j--) {
                System.out.print(Alphabet[j]);
            }
            System.out.println();
        }

        //5.Генерация уникальных чисел
        System.out.println("\n5.Генерация уникальных чисел");
        numbers = new int[30];
        len = numbers.length;
        for (int i = 0; i < len; i++) {
            numbers[i] = (int) (Math.random() * 41 + 60);
        }
        temp = 1;
        while (temp != 0) {
            for (int i = 0; i < len; i++) {
                temp = 0;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] < numbers[j + 1]) {
                        temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    } else if (numbers[j] == numbers[j + 1]) {
                        numbers[j + 1] = (int) (Math.random() * 41 + 60);
                        temp++;
                    }
                }
            }
        }
        for (int i = len - 1; i > -1; i--) {
            System.out.format("%1$-3d", numbers[i]);
            if ((i == 10) ||  (i == 20)) {
                System.out.println();
            }
        }

//        //6.Сдвиг элементов массива
//        System.out.println("\n6.Сдвиг элементов массива");
//        String[] stringArray = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
//        String[] stringArrayCopy = new String[4];
//        for (int i = 0; i < stringArray.length; i++) {
//            if (stringArray.isBlank() == false) {
//                System.arraycopy(stringArray, i, stringArrayCopy, i, 1);
//            }
//        }
//        for(int i = 0; i < len; i++) {
//            floatNumbers[i] = (float) Math.random();
//            System.out.format("%1$-3d%2$-1.5f%n", i+1, floatNumbers[i]);
//        }
    }
}
