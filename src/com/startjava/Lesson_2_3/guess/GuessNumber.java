package com.startjava.Lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber { 

    Scanner consoleTwo = new Scanner(System.in, "Cp866");

    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber (Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        secretNumber = (int) ( Math.random() * 101);
        while (true) {
            System.out.println(firstPlayer.getName() + " введите число:");
            firstPlayer.setNumber(consoleTwo.nextInt());
            if (firstPlayer.getNumber() < secretNumber) {
                System.out.println(firstPlayer.getName() + " число " + firstPlayer.getNumber() + 
                    " меньше того, что загадал компьютер");
            } else if (firstPlayer.getNumber() > secretNumber) {
                System.out.println(firstPlayer.getName() + " число " + firstPlayer.getNumber() + 
                    " больше того, что загадал компьютер");
            } else if (firstPlayer.getNumber() == secretNumber) {
                System.out.println(firstPlayer.getName() + " угадал, число которое загадал компьютер = " 
                    + secretNumber);
                break;
            }
            System.out.println(secondPlayer.getName() + " введите число:");
            secondPlayer.setNumber(consoleTwo.nextInt());
            if (secondPlayer.getNumber() < secretNumber) {
                System.out.println(secondPlayer.getName() + " число " + secondPlayer.getNumber() + 
                    " меньше того, что загадал компьютер");
            } else if (secondPlayer.getNumber() > secretNumber) {
                System.out.println(secondPlayer.getName() + " число " + secondPlayer.getNumber() + 
                    " больше того, что загадал компьютер");
            } else if (secondPlayer.getNumber() == secretNumber) {
                System.out.println(secondPlayer.getName() + " угадал, число которое загадал компьютер = " 
                    + secretNumber);
                break;
            }
        }
    }
}