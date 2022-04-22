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
        String gender = "Женский";
        if(gender != "Мужской") {
            System.out.println("Ты женщина");
        }
        double height = 3.1;
        if(height < 1.80) {
            System.out.println("Ты низкий");
        } else {
            System.out.println("Ты очень высокий");
        }
        char firstLetter = "Vladislav" .charAt(0);
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
        int oneNumber = (int) (Math.random() * 400 - 200);
        if(oneNumber % 2 == 0) {
            System.out.println("Число " + oneNumber + " чётное ");
        } else {
            System.out.println("Число " + oneNumber + " нечётное ");
        }
        if(oneNumber > 0) {
            System.out.println("Число " + oneNumber + " положительное ");
        } else if(oneNumber < 0) {
            System.out.println("Число " + oneNumber + " отрицательное ");
        } else {
            System.out.println("Число равно 0");
        }

        //Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number1Lesson4 = (int) (Math.random() * 100 + 100);
        int number11 = number1Lesson4 / 100;
        int number12 = number1Lesson4 / 10 % 10;
        int number13 = number1Lesson4 % 10;
        int number2Lesson4 = (int) (Math.random() * 50 + 100);
        int number21 = number2Lesson4 / 100;
        int number22 = number2Lesson4 / 10 % 10;
        int number23 = number2Lesson4 % 10;
        System.out.println("В числах " + number1Lesson4 + " и " + number2Lesson4 + " одинаковые: ");
        if(number11 == number21) {
            System.out.println(number11);
        }
        if(number12 == number22) {
            System.out.println(number12);
        }
        if(number13 == number23) {
            System.out.println(number13);
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u005A';
        System.out.println("Это большая буква " + symbol);

        //Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int sumDeposit = 300000;
        if(sumDeposit < 100000) {
            int procent = (int) (sumDeposit * 0.05);
            int sumWithProcent = sumDeposit + procent;
            System.out.println("Сумма вклада = " + sumDeposit + "\nНачисленный процент = " + procent + "\nИтоговая сумма = " + sumWithProcent);
        } else if(sumDeposit <= 300000) {
            int procent = (int) (sumDeposit * 0.07);
            int sumWithProcent = sumDeposit + procent;
            System.out.println("Сумма вклада = " + sumDeposit + "\nНачисленный процент = " + procent + "\nИтоговая сумма = " + sumWithProcent);
        } else {
            int procent = (int) (sumDeposit * 0.1);
            int sumWithProcent = sumDeposit + procent;
            System.out.println("Сумма вклада = " + sumDeposit + "\nНачисленный процент = " + procent + "\nИтоговая сумма = " + sumWithProcent);
        }

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
        double srednyScore = (historyScore + programmingScore) / 2;
        System.out.println(srednyScore + " - средний балл");
        double srednyProcent = (history + programming) / 2;
        System.out.println(srednyProcent + " - средний процент");

        //Расчет прибыли
        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int sale = 15000;
        int product = 9000;
        int totalForTheMonth = sale - (rent + product);
        int totalForTheYear = totalForTheMonth * 12;
        System.out.println("Прибыль за месяц: " + totalForTheMonth);
        System.out.println("Прибыль за год: " + totalForTheYear);

        //Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");
        int a = 3;
        int b = 4;
        int c = 5;
        if((a + b > c) & (b + c > a) & (a + c > b)) {
            System.out.println("Треугольник существует");
            if ((a<c) & (b<c)) {
                System.out.println("a и b катеты ");
                int square = (a * b) / 2;
                System.out.println("Площадь = " + square);
            } else if ((a<b) & (c<b)) {
                System.out.println("a и c катеты ");
            } else {
                System.out.println("b и c катеты ");
            }
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