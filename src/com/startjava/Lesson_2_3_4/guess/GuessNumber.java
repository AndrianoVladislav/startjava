package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber { 

    Scanner console = new Scanner(System.in, "Cp866");
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void launch() {
        System.out.println("Игра начинается! У каждого есть 10 попыток.");
        int secretNumber = (int) (Math.random() * 101);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count++;
            if (isGuessed(secretNumber, i, firstPlayer) || isGuessed(secretNumber, i, secondPlayer)) {
                break;
            }
        }
        printNumbers(firstPlayer);
        printNumbers(secondPlayer);
        firstPlayer.clear(count);
        secondPlayer.clear(count);
    }

    public boolean isGuessed(int secretNumber, int i, Player player) {
        System.out.println(player.getName() + " введите число:");
        player.addNumber(i, console.nextInt());
        String name = player.getName();
        int number = player.getNumber(i);
        if (number == secretNumber) {
            System.out.println("Игрок " + name + " угадал, число " + secretNumber + " c " + (i + 1) + " попытки");
            return true;
        } else if (number > secretNumber) {
            System.out.println(name + " число " + number + " больше того, что загадал компьютер");
        } else {
            System.out.println(name + " число " + number + " меньше того, что загадал компьютер");
        }
        if (i == 9) {
            System.out.println("К сожалению у " + name + " закончились попытки");
        }
        return false;
    }

    public void printNumbers(Player player) {
        for (int i = 0; i < 10; i++) {
            int[] numbers = player.getNumbers();
            if ((numbers[i] != 0)) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}