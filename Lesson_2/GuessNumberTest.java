import java.util.Scanner;

public class GuessNumberTest { 
    public static void main(String[] args){
        GuessNumber guessNumber = new GuessNumber();
        Scanner console = new Scanner(System.in, "Cp866");
        System.out.println("Первый игрок введите имя:");
        Player firstPlayer = new Player(console.nextLine());
        System.out.println("Второй игрок введите имя:");
        Player secondPlayer = new Player(console.nextLine());
        String answer = "yes"; 
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);
        while (answer.equals("yes")) {
            guessNumber.setSecretNumber((int) ( Math.random() * 101));
            while (guessNumber.getSecretNumber() != guessNumber.getPlayerNumber()) {
                System.out.println(firstPlayer.getName() + " введите число:");
                guessNumber.setPlayerNumber(console.nextInt());
                guessNumber.game();
                if (guessNumber.getSecretNumber() == guessNumber.getPlayerNumber()) {
                    break;
                }
                System.out.println(secondPlayer.getName() + " введите число:");
                guessNumber.setPlayerNumber(console.nextInt());
                guessNumber.game();
            }
            System.out.println("Вы угадали, число которое загадал компьютер = " + guessNumber.getPlayerNumber());
            System.out.println("Хотите продолжить игру? [yes/no]:");
            console.nextLine();
            while (!answer.equals("no")) {
                answer = console.nextLine();
                if ((answer.equals("yes")) && (answer.equals("yes"))) {
                    break;
                } else {
                    System.out.println("Недопустимое значение");
                }
            }
        }
    }
}