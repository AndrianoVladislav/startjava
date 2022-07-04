package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "Cp866");
        GuessNumber game = new GuessNumber(createPlayers(console));
        String answer = "yes";
        while (answer.equals("yes")) {
            game.launch();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = console.next();
            } while (!"no".equals(answer) && !"yes".equals(answer));
        }
    }

    public static String[] createPlayers(Scanner console) {
        String[] playersName = new String[3];
        for (int i = 0; i < playersName.length; i++) {
            System.out.println("Игрок введите имя:");
            playersName[i] = console.next();
        }
        return playersName;
    }
}