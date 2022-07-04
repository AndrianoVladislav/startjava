package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber { 

    Scanner console = new Scanner(System.in, "Cp866");
    private final Player[] players = new Player[3];

    public GuessNumber(String[] player) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(player[i]);
        }
    }

    public void launch() {
        System.out.println("Игра проходит в 3 тура");
        for (int i = 1; i < 4; i++) {
            System.out.println("Игра начинается! У каждого есть 10 попыток. Тур " + i);
            runGameplay();
        }
        System.out.println("Очки игроков:");
        for (Player player : players) {
            System.out.println(player.getName() + "=" + player.getScore());
        }
        makeWinner();
    }

    private void runGameplay() {
        castLots();
        int secretNumber = (int) (Math.random() * 100) + 1;
        while (trackingTime()) {
            if (isGuessed(secretNumber, players[0]) || isGuessed(secretNumber, players[1]) ||
                    isGuessed(secretNumber, players[2])) {
                break;
            }
        }
        printNumbers();
        for (Player player : players) {
            player.clear();
        }
    }

    public boolean trackingTime() {
        for (int i = 0; i < 3; i++) {
            if (players[i].getAttempts() < 10) {
                return true;
            }
        }
        return false;
    }

    private void castLots() {
        System.out.println("Бросаем жребий");
        int toss = (int) (Math.random() * 3);
        for (int i = players.length - 1; i > 0; i--) {
            Player temp = players[i];
            players[i] = players[toss];
            players[toss] = temp;
        }
    }

    private boolean isGuessed(int secretNumber, Player player) {
        if (player.getAttempts() < 10) {
            System.out.println(player.getName() + " введите число:");
            player.addNumber(console.nextInt());
            String name = player.getName();
            int number = player.getNumber();
            if (number == secretNumber) {
                System.out.println("Игрок " + name + " угадал, число " + secretNumber + " c " +
                        player.getAttempts() + " попытки");
                player.setScore(player.getScore() + 1);
                return true;
            }
            System.out.println(name + " число " + number + (number > secretNumber ? " больше " : " меньше ") +
                    "того, что загадал компьютер");
            if (player.getAttempts() == 10) {
                System.out.println("К сожалению у " + name + " закончились попытки");
            }
        }
        return false;
    }

    private void printNumbers() {
        for (int i = 0; i < 3; i++) {
            int[] numbers = players[i].getNumbers();
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private void makeWinner() {
        int[] scores = {players[0].getScore(), players[1].getScore(),players[2].getScore()};
        Arrays.sort(scores);
        int len = scores.length;
        String name = null;
        if (scores[len - 1] == scores[len - 2]) {
            System.out.println("Победителей нет!");
        } else {
            for (int i = 0; i < len; i++) {
                if (scores[len - 1] == players[i].getScore()) {
                    name = players[i].getName();
                }
            }
            System.out.println(name + " победил!!");
        }
    }
}