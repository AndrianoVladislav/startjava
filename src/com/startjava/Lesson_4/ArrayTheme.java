package com.startjava.Lesson_4;

public class ArrayTheme {
    public static void main(String[] args) {
        //1.Реверс значений массива
        System.out.println("1.Реверс значений массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();
        int temp;
        for (int i = 0; i < 4; i++) {
            temp = numbers[i];
            numbers[i] = numbers[6 - i];
            numbers[6 - i] = temp;
        }
        for (int number : numbers) {
            System.out.print(number);
        }

        //2.Вывод произведения элементов массива
        System.out.println("\n2.Вывод произведения элементов массива");
        int[] arrayNumbers = new int[10];
        for(int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i;
            if (arrayNumbers[i] == 9) {
                System.out.print(arrayNumbers[i] + " = ");
            } else if (arrayNumbers[i] == 0) {
                System.out.print("");
            } else {
                System.out.print(arrayNumbers[i] + " * ");
            }
        }
        int composition = 1;
        for (int i = 2; i < arrayNumbers.length; i++) {
            composition *= arrayNumbers[i];
        }
        System.out.print(composition + "\n");
        System.out.print(" [" + arrayNumbers[0] + "]-" + arrayNumbers[0]);
        System.out.print(" [" + arrayNumbers[arrayNumbers.length - 1] + "]-" + arrayNumbers[arrayNumbers.length - 1]);


        //3.Удаление элементов массива
        System.out.println("\n3.Удаление элементов массива");
        float[] arrayOne = new float[15];
        System.out.println("Исходный массив");
        for(int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (float) Math.random();
            System.out.format("%1$-3d%2$-1.5f%n", i+1, arrayOne[i]);
        }
        System.out.println("\nИзменённый массив");
        int counter = 0;
        for(int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > arrayOne[7]) {
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
        for(int i = 24; i > -2; i--) {
            for (int j = 25; j > i; j--) {
                System.out.print(arrayAlphabet[j]);
            }
            System.out.println();
        }

        //5.Генерация уникальных чисел
        System.out.println("\n5.Генерация уникальных чисел");
        int[] numberRandom = new int[30];
        for (int i = 0; i < numberRandom.length; i++) {
            numberRandom[i] = (int) (Math.random() * 41 + 60);
        }
        temp = 1;
        while (temp != 0) {
            for (int i = 0; i < 30; i++) {
                temp = 0;
                for (int j = 0; j < i; j++) {
                    if (numberRandom[j] < numberRandom[j + 1]) {
                        temp = numberRandom[j];
                        numberRandom[j] = numberRandom[j + 1];
                        numberRandom[j + 1] = temp;
                    } else if (numberRandom[j] == numberRandom[j + 1]) {
                        numberRandom[j + 1] = (int) (Math.random() * 41 + 60);
                        temp++;
                    }
                }
            }
        }
        for (int i = numberRandom.length - 1; i > -1; i--) {
            System.out.format("%1$-3d", numberRandom[i]);
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
