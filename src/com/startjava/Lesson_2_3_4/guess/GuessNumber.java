package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber { 

    Scanner console = new Scanner(System.in, "Cp866");
    private final Player[] players = new Player[3];

    public GuessNumber(String[] player) {
        players[0] = new Player(player[0]);
        players[1] = new Player(player[1]);
        players[2] = new Player(player[2]);
    }

    public void launch() {
        System.out.println("Игра проходит в 3 тура");
        for (int i = 1; i < 4; i++) {
            System.out.println("Игра начинается! У каждого есть 10 попыток. Тур " + i);
            runGameplay();
        }
        System.out.println("Очки игроков:");
        for (int i = 0; i < 3; i++) {
            System.out.println(players[i].getName() + "=" + players[i].getScore());
        }
        makeWinner(players[0].getScore(), players[1].getScore(), players[2].getScore());
    }

    public void makeWinner(int score0, int score1, int score2) {
        if (score0 > score1 && score0 > score2) {
            System.out.println(players[0].getName() + " победил!!");
        } else if (score1 > score0 && score1 > score2) {
            System.out.println(players[1].getName() + " победил!!");
        } else if (score2 > score0 && score2 > score1) {
            System.out.println(players[2].getName() + " победил!!");
        } else {
            System.out.println("Победителей нет!");
        }
    }

    public void runGameplay() {
        System.out.println("Бросаем жребий");
        int toss = (int) (Math.random() * 3);
        for (int i = players.length - 1; i > 0; i--) {
            Player temp = players[i];
            players[i] = players[toss];
            players[toss] = temp;
        }
        int secretNumber = (int) (Math.random() * 100) + 1;
        while (players[0].getAttempts() < 10 || players[1].getAttempts() < 10 || players[2].getAttempts() < 10) {
            if (isGuessed(secretNumber, players[0]) || isGuessed(secretNumber, players[1]) ||
                    isGuessed(secretNumber, players[2])) {
                break;
            }
        }
        printNumbers();
        players[0].clear();
        players[1].clear();
        players[2].clear();
    }

    private boolean isGuessed(int secretNumber, Player player) {
        if (player.getAttempts() < 10) {
            System.out.println(player.getName() + " введите число:");
            player.addNumber(console.nextInt());
            String name = player.getName();
            int number = player.getNumber();
            if (number == secretNumber) {
                System.out.println("Игрок " + name + " угадал, число " + secretNumber + " c " +
                        (player.getAttempts() + 1) + " попытки");
                player.setScore(player.getScore() + 1);
                return true;
            }
            System.out.println(name + " число " + number + (number > secretNumber ? " больше " : " меньше ") +
                    "того, что загадал компьютер");
            if (player.getAttempts() == 9) {
                System.out.println("К сожалению у " + name + " закончились попытки");
            }
            player.setAttempts(player.getAttempts() + 1);
        }
        return false;
    }

    public void printNumbers() {
        for (int i = 0; i < 3; i++) {
            int[] numbers = players[i].getNumbers();
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}