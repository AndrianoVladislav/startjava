package com.startjava.Lesson_4;

public class ArrayTheme {
    private static int[] numbers;

    public static void outputArray() {
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
        int temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[(numbers.length - 1) - i];
            numbers[(numbers.length - 1) - i] = temp;
        }
        outputArray();

        //2.Вывод произведения элементов массива
        System.out.println("\n2.Вывод произведения элементов массива");
        numbers = new int[10];
        int product = 1;
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            if ((numbers[i] != numbers.length - 1) && (numbers[i] != 0)){
                if (numbers[i] == (numbers.length - 2)) {
                    System.out.print(numbers[i] + " = ");
                    product *= numbers[i];
                } else {
                    product *= numbers[i];
                    System.out.print(numbers[i] + " * ");
                }
            }
        }
        System.out.print(product + "\n");
        System.out.print("[" + numbers[0] + "]-" + numbers[0]);
        System.out.print(" [" + numbers[numbers.length - 1] + "]-" + numbers[numbers.length - 1]);


        //3.Удаление элементов массива
        System.out.println("\n\n3.Удаление элементов массива");
        float[] arrayOne = new float[15];
        System.out.println("Исходный массив");
        for(int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (float) Math.random();
            System.out.format("%1$-3d%2$-1.5f%n", i+1, arrayOne[i]);
        }
        System.out.println("\nИзменённый массив");
        int counter = 0;
        for(int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > arrayOne[arrayOne.length / 2]) {
                arrayOne[i] = 0;
                counter++;
            }
            System.out.format("%1$-3d%2$-1.5f%n", i+1, arrayOne[i]);
        }
        System.out.println("Количество обнуюённых ячеек = " + counter);

        //4.Вывод элементов массива лесенкой в обратном порядке
        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] arrayAlphabet = new char[26];
        counter = 65;
        for(int i = 0; i < arrayAlphabet.length; i++) {
            arrayAlphabet[i] = (char) counter;
            counter++;
        }
        for(int i = arrayAlphabet.length - 2; i > -2; i--) {
            for (int j = arrayAlphabet.length - 1; j > i; j--) {
                System.out.print(arrayAlphabet[j]);
            }
            System.out.println();
        }

        //5.Генерация уникальных чисел
        System.out.println("\n5.Генерация уникальных чисел");
        numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 41 + 60);
        }
        temp = 1;
        while (temp != 0) {
            for (int i = 0; i < numbers.length; i++) {
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
        for (int i = numbers.length - 1; i > -1; i--) {
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
//        for(int i = 0; i < arrayOne.length; i++) {
//            arrayOne[i] = (float) Math.random();
//            System.out.format("%1$-3d%2$-1.5f%n", i+1, arrayOne[i]);
//        }
    }
}
