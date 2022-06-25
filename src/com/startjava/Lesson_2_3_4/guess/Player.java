package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] storageNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStorageNumbers(int i, int number ) {
        this.storageNumbers[i] = number;
    }

    public int getStorageNumbers(int i) {
        return storageNumbers[i];
    }

    public String displayAttempt(int a) {
        int[] copyStorageNumbers = Arrays.copyOf(storageNumbers, a);
        for(int i = 0; i < a; i++ ) {
            if ((copyStorageNumbers[i] != 0)) {
                System.out.print(copyStorageNumbers[i] + " ");
            }
        }
        return "";
    }

    public void fill() {
        Arrays.fill(storageNumbers, 0);
    }

}