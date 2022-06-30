package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers  = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int i, int number) {
        this.numbers[i] = number;
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, 10);
    }

    public void clear(int i) {
        Arrays.fill(numbers, 0, i, 0);
    }
}