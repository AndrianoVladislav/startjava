package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "Cp866");
        String[] players = new String[3];
        System.out.println("Первый игрок введите имя:");
        players[0] = console.next();
        System.out.println("Второй игрок введите имя:");
        players[1] = console.next();
        System.out.println("Третий игрок введите имя:");
        players[2] = console.next();
        GuessNumber game = new GuessNumber(players);
        String answer = "yes";
        while (answer.equals("yes")) {
            game.launch();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = console.next();
            } while (!"no".equals(answer) && !"yes".equals(answer));
        }
    }
}