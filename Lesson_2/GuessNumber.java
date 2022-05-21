public class GuessNumber { 

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

    public void game() {
        difference = secretNumber - playerNumber;
        if (playerNumber < secretNumber) {
            if (difference > 5) {
                System.out.println("Число " + playerNumber + " сильно меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            }
        } else if (playerNumber > secretNumber) {
            if (difference < -5) {
                System.out.println("Число " + playerNumber + " сильно больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            }
        }
    }
}