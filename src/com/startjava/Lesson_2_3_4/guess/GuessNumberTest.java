package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "Cp866");
        System.out.println("Первый игрок введите имя:");
        Player player1 = new Player(console.next());
        System.out.println("Второй игрок введите имя:");
        Player player2 = new Player(console.next());
        System.out.println("Третий игрок введите имя:");
        Player player3 = new Player(console.next());
        GuessNumber game = new GuessNumber(player1, player2, player3);
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