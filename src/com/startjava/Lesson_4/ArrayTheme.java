package com.startjava.Lesson_4;

public class ArrayTheme {
    public static void main(String[] args) {
        //1.Реверс значений массива
        System.out.println("1.Реверс значений массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        outputArray(numbers);
        int len = numbers.length;
        int temp;
        for (int i = 0; i < len / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[(len - 1) - i];
            numbers[len - 1 - i] = temp;
        }
        outputArray(numbers);

        //2.Вывод произведения элементов массива
        System.out.println("\n2.Вывод произведения элементов массива");
        numbers = new int[10];
        len = numbers.length - 1;
        int product = 1;
        for(int i = 0; i < len + 1; i++) {
            numbers[i] = i;
        }
        for(int i = 1; i < len; i++) {
            product *= numbers[i];
            System.out.print(i < len - 1 ? numbers[i] + " * " : numbers[i] + " = " + product + "\n");
        }
        System.out.print("[" + numbers[0] + "]-" + numbers[0]);
        System.out.print(" [" + numbers[len] + "]-" + numbers[len]);

        //3.Удаление элементов массива
        System.out.println("\n\n3.Удаление элементов массива");
        float[] floatNumbers = new float[15];
        len = floatNumbers.length;
        System.out.println("Исходный массив");
        for(int i = 0; i < len; i++) {
            floatNumbers[i] = (float) Math.random();
            System.out.format("%1$-3d%2$-1.5f%n", i + 1, floatNumbers[i]);
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
        char[] alphabet = new char[26];
        len = alphabet.length - 1;
        int idx = 0;
        for(char symbol = 'A'; symbol <= 'Z'; symbol++) {
            alphabet[idx++] = symbol;
        }
        for(int i = 0; i < len + 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet[len - j]);
            }
            System.out.println();
        }

        //5.Генерация уникальных чисел
        System.out.println("\n5.Генерация уникальных чисел");
        numbers = new int[30];
        len = numbers.length;
        for (int i = 0; i < len; i++) {
            numbers[i] = (int) (Math.random() * (100 - 60 + 1)) + 60;
        }
        int newNum;
        for (int i = 0; i < len; i++) {
            newNum = (int) (Math.random() * (100 - 60 + 1)) + 60;
            for (int j = 0; j < len; j++) {
                if (newNum == numbers[j]) {
                    newNum = 1;
                    break;
                }
            }
            if (newNum != 1) numbers[i] = newNum;
            else i--;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i = 1; i <= len; i++) {
            System.out.print(i % 10 == 0 ? numbers[i - 1] + "\n" : numbers[i - 1] + " ");
        }
        //6.Сдвиг элементов массива
        System.out.println("\n6.Сдвиг элементов массива");
        String[] strings = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = strings.length;
        counter = 0;
        for (int i = 0; i < len; i++) {
            if (!strings[i].isBlank()) {
                counter++;
            }
        }
        String[] newStrings = new String[counter];
        int indexNewStrings = 0;
        for (int indexStrings = 0; indexStrings < len; indexStrings++) {
            if (!strings[indexStrings].isBlank()) {
                if ((indexStrings + 1 < len - 1) && (!strings[indexStrings + 1].isBlank())) {
                    System.arraycopy(strings, indexStrings, newStrings, indexNewStrings, 2);
                    indexNewStrings += 2;
                    indexStrings++;
                } else {
                    System.arraycopy(strings, indexStrings, newStrings, indexNewStrings, 1);
                    indexNewStrings++;
                }
            }
        }
        System.out.println("Исходный массив");
        for(int i = 0; i < len; i++) {
            System.out.println((i + 1) + "-" + strings[i]);
        }
        System.out.println("Копия массива");
        for(int i = 0; i < newStrings.length; i++) {
            System.out.println((i + 1) + "-" + newStrings[i]);
        }
    }

    private static void outputArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();
    }
}
