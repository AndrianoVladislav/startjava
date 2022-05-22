import java.util.Scanner;

public class GuessNumber { 

    Scanner consoleTwo = new Scanner(System.in, "Cp866");

    private int secretNumber;
    private int playerNumber;
    private int difference = 0;

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

    public void supposeNumber() {
        secretNumber = (int) ( Math.random() * 101);
    }

    public void enterNumber () {
        playerNumber = consoleTwo.nextInt();
    }

    public void play() {
        difference = secretNumber - playerNumber;
        if (playerNumber < secretNumber) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        } else if (playerNumber > secretNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        }
    }
}