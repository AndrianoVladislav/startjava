package com.startjava.Lesson_1.base;

public class IfElseStatementTheme { 
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = (int) (Math.random() * 90);
        System.out.println("Возраст человека = " + age);
        if(age > 20) {
            System.out.println("Человек закончил школу");
        } else {
            System.out.println("Человек ещё учиться");
        }
        boolean gender = false;
        if(!gender) {
            System.out.println("Ты женщина");
        }

        double height = 3.1;
        if(height < 1.80) {
            System.out.println("Ты низкий");
        } else {
            System.out.println("Ты очень высокий");
        }
        char firstLetter = "Vladislav".charAt(0);
        if(firstLetter == 'M') {
            System.out.println("Тебя зовут Марат");
        } else if(firstLetter == 'I') {
            System.out.println("Тебя зовут Игорь");
        } else {
            System.out.println("У тебя необычное имя");
        }

        //Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа");
        int firstNumber = (int) (Math.random() * 100);
        int secondNumber = (int) (Math.random() * 100);
        if(firstNumber > secondNumber) {
            System.out.println("Число " + firstNumber + " больше числа " + secondNumber);
        } else if(firstNumber < secondNumber)  {
            System.out.println("Число " + secondNumber + " больше числа " + firstNumber);
        } else {
            System.out.println("Число " + secondNumber + " равно числу " + firstNumber);
        }

        //Работа с числом
        System.out.println("\n3. Работа с числом");
        int srcNumber = (int) (Math.random() * 400 - 200);
        if (srcNumber != 0) {
            if(srcNumber % 2 == 0) {
                System.out.println("Число " + srcNumber + " чётное ");
            } else {
                System.out.println("Число " + srcNumber + " нечётное ");
            }
            if(srcNumber > 0) {
                System.out.println("Число " + srcNumber + " положительное ");
            } else if(srcNumber < 0) {
                System.out.println("Число " + srcNumber + " отрицательное ");
            }
        } else {
            System.out.println("Число равно 0");
        }

        //Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int srcNumber1 = (int) (Math.random() * 100 + 100);
        int digit11 = srcNumber1 / 100;
        int digit12 = srcNumber1 / 10 % 10;
        int digit13 = srcNumber1 % 10;
        int srcNumber2 = (int) (Math.random() * 50 + 100);
        int digit21 = srcNumber2 / 100;
        int digit22 = srcNumber2 / 10 % 10;
        int digit23 = srcNumber2 % 10;
        System.out.println("В числах " + srcNumber1 + " и " + srcNumber2 + " одинаковые: ");
        if(digit11 == digit21) {
            System.out.println(digit11);
        }
        if(digit12 == digit22) {
            System.out.println(digit12);
        }
        if(digit13 == digit23) {
            System.out.println(digit13);
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        if ((symbol > '0') && (symbol < '9')) {
            System.out.println("Это число " + symbol);
        } else if ((symbol > 'A') && (symbol < 'Z')) {
            System.out.println("Это большая буква " + symbol);
        } else if ((symbol > 'a') && (symbol < 'z')) {
            System.out.println("Это маленькая буква " + symbol);
        } else {
            System.out.println("Это символ " + symbol);
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int sumDeposit = 300000;
        int procent = 0;
        if(sumDeposit < 100000) {
            procent = (int) (sumDeposit * 0.05);
        } else if(sumDeposit <= 300000) {
            procent = (int) (sumDeposit * 0.07);
        } else {
            procent = (int) (sumDeposit * 0.1);
        }
        int sumWithProcent = sumDeposit + procent;
        System.out.println("Сумма вклада = " + sumDeposit + "\nНачисленный процент = " + procent + "\nИтоговая сумма = " + sumWithProcent);

        //Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        int historyScore = 0;
        if(history <= 60) {
             historyScore = 2;
        } else if(history <= 73 ) {
             historyScore = 3;
        } else if(history <= 91 ) {
             historyScore = 4;
        } else {
             historyScore = 5;
        }
        int programmingScore = 0;
        if(programming <= 60) {
             programmingScore = 2;
        } else if(programming <= 73 ) {
             programmingScore = 3;
        } else if(programming <= 91 ) {
             programmingScore = 4;
        } else {
             programmingScore = 5;
        }
        System.out.println(historyScore + " - оценка по истории");
        System.out.println(programmingScore + " - оценка по программированию");
        double averageScore = (historyScore + programmingScore) / 2;
        System.out.println(averageScore + " - средний балл");
        double averageProcent = (history + programming) / 2;
        System.out.println(averageProcent + " - средний процент");

        //Расчет прибыли
        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int sale = 15000;
        int product = 9000;
        int totalForYear = (sale - (rent + product)) * 12;
        if (totalForYear > 0) {
            System.out.println("Прибыль за год: +" + totalForYear);
        } else {
            System.out.println("Потери за год: -" + totalForYear);
        }

        //Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");
        int a = 3;
        int b = 4;
        int c = 5;
        int leg1 = 0;
        int leg2 = 0;
        if((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Треугольник существует");
            if ((a < c) && (b < c)) {
                System.out.println("a и b катеты ");
                leg1 = a;
                leg2 = b;
            } else if ((a < b) && (c < b)) {
                System.out.println("a и c катеты ");
                leg1 = a;
                leg2 = c;
            } else {
                System.out.println("b и c катеты ");
                leg1 = c;
                leg2 = b;
            }
            int square = (leg1 * leg2) / 2;
            System.out.println("Площадь = " + square);
            System.out.println("    /| ");
            System.out.println("   / | ");
            System.out.println("  /  | ");
            System.out.println(" /___| ");
        } else {
            System.out.println("Треугольник не существует");
        }

        //Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот");
        int money = 567;
        int fiftyBanknote = money / 50;
        int fifty = fiftyBanknote * 50;
        money = money - fifty;
        int tenBanknote = money / 10;
        int ten = tenBanknote * 10;
        money = money - ten;
        int one = money;
        System.out.println(fiftyBanknote + " - номинала 50");
        System.out.println(tenBanknote + " - номинала 10");
        System.out.println(one + " - номинала 1");
        System.out.println("Исходная сумма " + (fifty + ten + one));
    }
}