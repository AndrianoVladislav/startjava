package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "Cp866");
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.firstLaunch();
        System.out.println("Добро пожаловать в вашу книжную полку");
        int answer = 0;
        while (answer != 4) {
            bookshelf.launch();
            System.out.println("""
                    Выберите действие:
                    1 - Добавить книгу
                    2 - Удалить книгу
                    3 - Искать книгу
                    4 - Выйти""");
            answer = console.nextInt();
            switch (answer) {
                case 1 -> bookshelf.addBook();
                case 2 -> bookshelf.deleteBook();
                case 3 -> bookshelf.search();
                case 4 -> System.out.println("Выход из полки");
                default -> System.out.println("Действие не найдено!");
            }
        }
    }
}
