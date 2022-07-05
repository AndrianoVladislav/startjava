package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "Cp866");
        Bookshelf bookshelf = new Bookshelf();
        System.out.println("Добро пожаловать в вашу книжную полку");
        String answer = "yes";
        while (!answer.equals("4")) {
            bookshelf.launch(answer);
            do {
                System.out.println("""
                        Выберите действие:
                        1 - Добавить книгу
                        2 - Удалить книгу
                        3 - Искать книгу
                        4 - Выйти""");
                answer = console.next();
            } while (!"1".equals(answer) && !"2".equals(answer) && !"3".equals(answer) && !"4".equals(answer));
        }
    }
}
