package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber { 

    Scanner console = new Scanner(System.in, "Cp866");
    private final Player[] players = new Player[3];

    public GuessNumber(Player firstPlayer, Player secondPlayer, Player thirdPlayer) {
        this.players[0] = firstPlayer;
        this.players[1] = secondPlayer;
        this.players[2] = thirdPlayer;
    }

    public void launch() {
        System.out.println("Игра проходит в 3 тура");
        for (int i = 1; i < 4; i++) {
            System.out.println("Игра начинается! У каждого есть 10 попыток. Тур " + i);
            play();
        }
        System.out.println("Очки игроков:");
        System.out.println(players[0].getName() + "=" + players[0].getScore());
        System.out.println(players[1].getName() + "=" + players[1].getScore());
        System.out.println(players[2].getName() + "=" + players[2].getScore());
        if (players[0].getScore() > players[1].getScore() && players[0].getScore() > players[2].getScore()) {
            System.out.println(players[0].getName() + " победил!!");
        } else if (players[1].getScore() > players[0].getScore() && players[1].getScore() > players[2].getScore()) {
            System.out.println(players[1].getName() + " победил!!");
        } else if (players[2].getScore() > players[0].getScore() && players[2].getScore() > players[1].getScore()) {
            System.out.println(players[2].getName() + " победил!!");
        } else {
            System.out.println("Победителей нет!");
        }
    }

    public void play() {
        System.out.println("Бросаем жребий");
        int toss = (int) (Math.random() * 3);
        for (int i = players.length - 1; i > 0; i--) {
            Player temp = players[i];
            players[i] = players[toss];
            players[toss] = temp;
        }
        int secretNumber = (int) (Math.random() * 100) + 1;
        while (players[0].getAttempts() < 10 || players[1].getAttempts() < 10 || players[2].getAttempts() < 10) {
            if (players[0].getAttempts() < 10) {
                if (isGuessed(secretNumber, players[0])) {
                    players[0].setScore(players[0].getScore() + 1);
                    continue;
                }
            }
            if (players[1].getAttempts() < 10) {
                if (isGuessed(secretNumber, players[1])) {
                    players[1].setScore(players[1].getScore() + 1);
                    continue;
                }
            }
            if (players[2].getAttempts() < 10) {
                if (isGuessed(secretNumber, players[2])) {
                    players[2].setScore(players[2].getScore() + 1);
                }
            }
        }
        printNumbers(players[0]);
        printNumbers(players[1]);
        printNumbers(players[2]);
        players[0].clear();
        players[1].clear();
        players[2].clear();
    }

    private boolean isGuessed(int secretNumber, Player player) {
        System.out.println(player.getName() + " введите число:");
        player.addNumber(console.nextInt());
        String name = player.getName();
        int number = player.getNumber();
        if (number == secretNumber) {
            System.out.println("Игрок " + name + " угадал, число " + secretNumber + " c " + (player.getAttempts() + 1)
                    + " попытки");
            players[0].setAttempts(10);
            players[1].setAttempts(10);
            players[2].setAttempts(10);
            return true;
        }
        System.out.println(name + " число " + number + (number > secretNumber ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        if (player.getAttempts() == 9) {
            System.out.println("К сожалению у " + name + " закончились попытки");
        }
        player.setAttempts(player.getAttempts() + 1);
        return false;
    }

    public void printNumbers(Player player) {
        int[] numbers = player.getNumbers();
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}