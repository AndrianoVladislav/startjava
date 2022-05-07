public class GuessNumber { 
    public static void main(String[] args) {
        int givenNumber = 99;
        int estimatedNumber = 1;
        int difference = 0;
        while (estimatedNumber != givenNumber) {
            difference = givenNumber - estimatedNumber;
            if (estimatedNumber < givenNumber) {
                if (difference > 5) {
                    System.out.println("Число " + estimatedNumber + " сильно меньше того, что загадал компьютер");
                    estimatedNumber += 5;
                } else {
                    System.out.println("Число " + estimatedNumber + " меньше того, что загадал компьютер");
                    estimatedNumber++;
                }
            } else if (estimatedNumber > givenNumber) {
                if (difference < -5) {
                    System.out.println("Число " + estimatedNumber + " сильно больше того, что загадал компьютер");
                    estimatedNumber -= 5;
                } else {
                    System.out.println("Число " + estimatedNumber + " больше того, что загадал компьютер");
                    estimatedNumber--;
                }
            }
        }
        System.out.println("Вы угадали, число которое загадал компьютер = " + estimatedNumber);
    }
}