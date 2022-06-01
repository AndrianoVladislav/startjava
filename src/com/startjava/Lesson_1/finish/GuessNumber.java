package com.startjava.Lesson_1.finish;

public class GuessNumber { 
    public static void main(String[] args) {
        int secretNumber = 33;
        int playerNumber = 99;
        int difference = 0;
        while (playerNumber != secretNumber) {
            difference = secretNumber - playerNumber;
            if (playerNumber < secretNumber) {
                if (difference > 5) {
                    System.out.println("Число " + playerNumber + " сильно меньше того, что загадал компьютер");
                    playerNumber += 4;
                } else {
                    System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                    playerNumber++;
                }
            } else if (playerNumber > secretNumber) {
                if (difference < -5) {
                    System.out.println("Число " + playerNumber + " сильно больше того, что загадал компьютер");
                    playerNumber -= 5;
                } else {
                    System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                    playerNumber--;
                }
            }
        }
        System.out.println("Вы угадали, число которое загадал компьютер = " + playerNumber);
    }
}