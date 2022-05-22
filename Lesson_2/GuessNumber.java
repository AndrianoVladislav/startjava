import java.util.Scanner;

public class GuessNumber { 

    Scanner consoleTwo = new Scanner(System.in, "Cp866");

    private int secretNumber;

    public void play() {
        System.out.println("Первый игрок введите имя:");
        consoleTwo.nextLine();
        Player firstPlayer = new Player(consoleTwo.nextLine());
        System.out.println("Второй игрок введите имя:");
        Player secondPlayer = new Player(consoleTwo.nextLine());
        secretNumber = (int) ( Math.random() * 101);
        while ((secretNumber != firstPlayer.getNumber()) || (secretNumber != secondPlayer.getNumber())) {
            System.out.println(firstPlayer.getName() + " введите число:");
            firstPlayer.setNumber(consoleTwo.nextInt());
            if (firstPlayer.getNumber() < secretNumber) {
                System.out.println(firstPlayer.getName() + " число " + firstPlayer.getNumber() + " меньше того, что загадал компьютер");
            } else if (firstPlayer.getNumber() > secretNumber) {
                System.out.println(firstPlayer.getName() + " число " + firstPlayer.getNumber() + " больше того, что загадал компьютер");
            } else {
                break;
            }
            System.out.println(secondPlayer.getName() + " введите число:");
            secondPlayer.setNumber(consoleTwo.nextInt());
            if (secondPlayer.getNumber() < secretNumber) {
                System.out.println(secondPlayer.getName() + " число " + secondPlayer.getNumber() + " меньше того, что загадал компьютер");
            } else if (secondPlayer.getNumber() > secretNumber) {
                System.out.println(secondPlayer.getName() + " число " + secondPlayer.getNumber() + " больше того, что загадал компьютер");
            } else {
                break;
            }
        }
        System.out.println("Вы угадали, число которое загадал компьютер = " + secretNumber);
    }
}