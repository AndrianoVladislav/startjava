package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber { 

    Scanner consoleTwo = new Scanner(System.in, "Cp866");

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber (Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        int secretNumber = (int) (Math.random() * 101);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(firstPlayer.getName() + " введите число:");
            firstPlayer.setStorageNumbers(i, consoleTwo.nextInt());
            if (firstPlayer.getStorageNumbers(i) < secretNumber) {
                System.out.println(firstPlayer.getName() + " число " + firstPlayer.getStorageNumbers(i) +
                    " меньше того, что загадал компьютер");
            } else if (firstPlayer.getStorageNumbers(i) > secretNumber) {
                System.out.println(firstPlayer.getName() + " число " + firstPlayer.getStorageNumbers(i) +
                    " больше того, что загадал компьютер");
            } else if (firstPlayer.getStorageNumbers(i) == secretNumber) {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал, число " + secretNumber + " c " +
                        (i + 1) + " попытки");
                break;
            }
            if ( i == 9) {
                System.out.println("К сожелению у " + firstPlayer.getName() + " закончились попытки");
            }
            System.out.println(secondPlayer.getName() + " введите число:");
            secondPlayer.setStorageNumbers(i, consoleTwo.nextInt());
            if (secondPlayer.getStorageNumbers(i) < secretNumber) {
                System.out.println(secondPlayer.getName() + " число " + secondPlayer.getStorageNumbers(i) +
                    " меньше того, что загадал компьютер");
            } else if (secondPlayer.getStorageNumbers(i) > secretNumber) {
                System.out.println(secondPlayer.getName() + " число " + secondPlayer.getStorageNumbers(i) +
                    " больше того, что загадал компьютер");
            } else if (secondPlayer.getStorageNumbers(i) == secretNumber) {
                System.out.println("Игрок " + secondPlayer.getName() + " угадал, число " + secretNumber + " c " +
                        (i + 1) + " попытки");
                break;
            }
            if ( i == 9) {
                System.out.println("К сожелению у " + secondPlayer.getName() + " закончились попытки");
            }
            count++;
        }
        System.out.println(count + 1);
        System.out.println(firstPlayer.displayAttempt(count + 1));
        System.out.println(secondPlayer.displayAttempt(count + 1));
        firstPlayer.fill();
        secondPlayer.fill();
    }
}