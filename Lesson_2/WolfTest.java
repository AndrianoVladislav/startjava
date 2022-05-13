public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Пол - " + (wolfOne.gender = "Мужской"));
        System.out.println("Имя - " + (wolfOne.name = "Бобик"));
        System.out.println("Вес - " + (wolfOne.height = 20.6f) + " килограмм");
        System.out.println("Возраст - " + (wolfOne.age = 10) + " лет");
        System.out.println("Цвет - " + (wolfOne.color = "Чёрный"));
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howls();
        wolfOne.hunt();
    }
}