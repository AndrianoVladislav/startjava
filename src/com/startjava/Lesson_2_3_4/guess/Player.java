package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers  = new int[10];
    private int attempts = 0;
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        if (number <= 0 || number > 100) {
            System.out.println("Значение не входит в диапозон (0,100]");
            attempts--;
        } else {
            this.numbers[attempts] = number;
        }

    }

    public int getNumber() {
        return numbers[attempts];
    }

    public int[] getNumbers() {
        if (attempts == 0) {
            attempts++;
        } else {
            while (numbers[attempts - 1] == 0) {
                attempts--;
            }
        }
        return Arrays.copyOf(numbers, attempts);
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}