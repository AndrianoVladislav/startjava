import java.util.Scanner;

public class GuessNumber { 

    Scanner consoleTwo = new Scanner(System.in, "Cp866");

    private int secretNumber;
    private int playerNumber;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public void play() {
        secretNumber = (int) ( Math.random() * 101);
        while (secretNumber != playerNumber) {
            System.out.println("Первый игрок введите число:");
            playerNumber = consoleTwo.nextInt();
            if (playerNumber < secretNumber) {
                System.out.println("Первый игрок, число " + playerNumber + " меньше того, что загадал компьютер");
            } else if (playerNumber > secretNumber) {
                System.out.println("Первый игрок, число " + playerNumber + " больше того, что загадал компьютер");
            } else {
                break;
            }
            System.out.println("Второй игрок введите число:");
            playerNumber = consoleTwo.nextInt();
            if (playerNumber < secretNumber) {
                System.out.println("Второй игрок, число " + playerNumber + " меньше того, что загадал компьютер");
            } else if (playerNumber > secretNumber) {
                System.out.println("Второй игрок, число " + playerNumber + " больше того, что загадал компьютер");
            } else {
                break;
            }
        }
    System.out.println("Вы угадали, число которое загадал компьютер = " + playerNumber);
    }
}