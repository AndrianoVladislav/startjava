public class Person {

    String gender = "Мужской";
    String name = "Вова";
    float height = 181.6f;
    float weight = 60.4f;
    int age = 25;

    void go() {
        System.out.println("Идёт");
    }

    void sit() {
        System.out.println("Сидит");
    }

    void run() {
        System.out.println("Бежит");
    }

    String talk() {
        return "Привет";
    }

    boolean learnJava() {
        return true;
    }
}