package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in, "Cp866");
        System.out.println("Первый игрок введите имя:");
        Player player1 = new Player(console.next());
        System.out.println("Второй игрок введите имя:");
        Player player2 = new Player(console.next());
        System.out.println("Игра начинается! У каждого есть 10 попыток.");
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "yes";
        while (answer.equals("yes")) {
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = console.next();
            } while (!"no".equals(answer) && !"yes".equals(answer));
        }
    }
}