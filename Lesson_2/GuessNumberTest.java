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
        while (answer.equals("yes")) {
            guessNumber.supposeNumber();
            while (guessNumber.getSecretNumber() != guessNumber.getPlayerNumber()) {
                System.out.println(firstPlayer.getName() + " введите число:");
                guessNumber.enterNumber();
                guessNumber.play();
                if (guessNumber.getSecretNumber() == guessNumber.getPlayerNumber()) {
                    break;
                }
                System.out.println(secondPlayer.getName() + " введите число:");
                guessNumber.enterNumber();
                guessNumber.play();
            }
            System.out.println("Вы угадали, число которое загадал компьютер = " + guessNumber.getPlayerNumber());
            System.out.println("Хотите продолжить игру? [yes/no]:");
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