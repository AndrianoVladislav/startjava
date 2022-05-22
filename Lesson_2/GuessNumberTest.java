import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args){
        GuessNumber guessNumber = new GuessNumber();
        Scanner console = new Scanner(System.in, "Cp866");
        String answer = "yes";
        while (answer.equals("yes")) {
            guessNumber.play();
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