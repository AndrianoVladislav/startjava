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
        int attempts = 10;
        for (int i = 0; i < attempts; i++) {
            count++;
            if (go(secretNumber, i, firstPlayer) || go(secretNumber, i, secondPlayer)) {
                break;
            }
        }
        System.out.println(output(firstPlayer));
        System.out.println(output(secondPlayer));
        firstPlayer.clear(count);
        secondPlayer.clear(count);
    }
    public boolean go(int secretNumber, int i, Player playerNow) {
        System.out.println(playerNow.getName() + " введите число:");
        playerNow.addNumber(i, console.nextInt());
        boolean end = false;
        if (playerNow.getNumber(i) == secretNumber) {
            System.out.println("Игрок " + playerNow.getName() + " угадал, число " + secretNumber + " c " +
                    (i + 1) + " попытки");
            end = true;
        } else if (playerNow.getNumber(i) > secretNumber) {
            System.out.println(playerNow.getName() + " число " + playerNow.getNumber(i) +
                    " больше того, что загадал компьютер");
        } else {
            System.out.println(playerNow.getName() + " число " + playerNow.getNumber(i) +
                    " меньше того, что загадал компьютер");
        }
        if (i == 9) {
            System.out.println("К сожалению у " + playerNow.getName() + " закончились попытки");
        }
        return end;
    }

    public String output(Player playerNow) {
        for (int i = 0; i < 10; i++) {
            if ((playerNow.getNumber(i) != 0)) {
                System.out.print(playerNow.getNumber(i) + " ");
            }
        }
        return "";
    }

}