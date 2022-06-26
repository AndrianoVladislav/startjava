package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;
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
        for (int i = 0; i < firstPlayer.getLen(); i++) {
            count++;
            try {
                firstPlayer(secretNumber, i);
                secondPlayer(secretNumber, i);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                break;
            }

        }
        int[] copyNumbers  = Arrays.copyOf(firstPlayer.getNumber2() ,(count + 1));
        for (int copyNumber : copyNumbers) {
            if ((copyNumber != 0)) {
                System.out.print(copyNumber + " ");
            }
        }
        System.out.println();
        copyNumbers = Arrays.copyOf(secondPlayer.getNumber2(), (count + 1));
        for (int copyNumber : copyNumbers) {
            if ((copyNumber != 0)) {
                System.out.print(copyNumber + " ");
            }
        }
        System.out.println();
        firstPlayer.fill(count);
        secondPlayer.fill(count);
    }
    public void firstPlayer(int secretNumber, int i) {
        System.out.println(firstPlayer.getName() + " введите число:");
        firstPlayer.addNumber(i, console.nextInt());
        if (firstPlayer.getNumber(i) == secretNumber) {
            throw new IllegalArgumentException("Игрок " + firstPlayer.getName() + " угадал, число " + secretNumber + " c " +
                    (i + 1) + " попытки");
        } else if (firstPlayer.getNumber(i) > secretNumber) {
            System.out.println(firstPlayer.getName() + " число " + firstPlayer.getNumber(i) +
                    " больше того, что загадал компьютер");
        } else {
            System.out.println(firstPlayer.getName() + " число " + firstPlayer.getNumber(i) +
                    " меньше того, что загадал компьютер");
        }
        if ( i == 9) {
            System.out.println("К сожалению у " + firstPlayer.getName() + " закончились попытки");
        }
    }

    public void secondPlayer(int secretNumber, int i) {
        System.out.println(secondPlayer.getName() + " введите число:");
        secondPlayer.addNumber(i, console.nextInt());
        if (secondPlayer.getNumber(i) == secretNumber) {
            throw new IllegalArgumentException("Игрок " + secondPlayer.getName() + " угадал, число " + secretNumber + " c " +
                    (i + 1) + " попытки");
        } else if (secondPlayer.getNumber(i) > secretNumber) {
            System.out.println(secondPlayer.getName() + " число " + secondPlayer.getNumber(i) +
                    " больше того, что загадал компьютер");
        } else {
            System.out.println(secondPlayer.getName() + " число " + secondPlayer.getNumber(i) +
                    " меньше того, что загадал компьютер");
        }
        if ( i == 9) {
            System.out.println("К сожалению у " + secondPlayer.getName() + " закончились попытки");
        }
    }

}