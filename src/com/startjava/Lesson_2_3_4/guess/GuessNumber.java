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
        int secretNumber = (int) (Math.random() * 100) + 1;
        int i;
        for (i = 0; i < 10; i++) {
            if (isGuessed(secretNumber, i, firstPlayer) || isGuessed(secretNumber, i, secondPlayer)) {
                break;
            }
        }
        printNumbers(firstPlayer, i + 1);
        printNumbers(secondPlayer, i + 1);
        firstPlayer.clear(i);
        secondPlayer.clear(i);
    }

    private boolean isGuessed(int secretNumber, int i, Player player) {
        System.out.println(player.getName() + " введите число:");
        player.addNumber(i, console.nextInt());
        String name = player.getName();
        int number = player.getNumber(i);
        if (number == secretNumber) {
            System.out.println("Игрок " + name + " угадал, число " + secretNumber + " c " + (i + 1) + " попытки");
            return true;
        }
        if (number > secretNumber) {
            System.out.println(name + " число " + number + " больше того, что загадал компьютер");
        } else {
            System.out.println(name + " число " + number + " меньше того, что загадал компьютер");
        }
        if (i == 9) {
            System.out.println("К сожалению у " + name + " закончились попытки");
        }
        return false;
    }

    public void printNumbers(Player player,int i) {
        int[] numbers = player.getNumbers(i);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}