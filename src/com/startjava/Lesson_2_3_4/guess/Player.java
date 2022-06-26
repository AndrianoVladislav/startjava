package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers  = new int[10];
    private int len = numbers.length;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int i, int number) {
        this.numbers [i] = number;
    }

    public int getNumber(int i) {
        return numbers [i];
    }

    public int[] getNumber2() {
        return numbers;
    }

    public void fill(int a) {
        Arrays.fill(numbers, 0, a, 0);
    }

    public int getLen() {
        return len;
    }
}