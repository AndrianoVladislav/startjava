package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private int[] numbers  = new int[10];
    private int attempts;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void addNumber(int number) {
        if (number <= 0 || number > 100) {
            System.out.println("Значение не входит в диапазон (0,100]");
        } else {
            this.numbers[attempts] = number;
            attempts++;
        }
    }

    public int getNumber() {
        return numbers[attempts - 1];
    }

    public int[] getNumbers() {
        if (attempts == 0) {
            return numbers = new int[0];
        } else {
            return Arrays.copyOf(numbers, attempts);
        }
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}