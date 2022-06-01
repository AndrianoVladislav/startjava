package com.startjava.Lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Мужской");
        System.out.println("Пол - " + wolfOne.getGender());
        wolfOne.setName("Бобик");
        System.out.println("Имя - " + wolfOne.getName());
        wolfOne.setHeight(20.6f);
        System.out.println("Вес - " + wolfOne.getHeight() + " килограмм");
        wolfOne.setAge(5);
        System.out.println("Возраст - " + wolfOne.getAge() + " лет");
        wolfOne.setColor("Чёрный");
        System.out.println("Цвет - " + wolfOne.getColor());
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}