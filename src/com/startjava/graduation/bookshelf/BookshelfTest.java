package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class BookshelfTest {

    static Scanner console = new Scanner(System.in, "Cp866");
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в вашу книжную полку\n");
        int answer;
        do {
            display();
            System.out.println("""
                    \nВыберите действие:
                    1 - Добавить книгу
                    2 - Удалить книгу
                    3 - Искать книгу
                    4 - Выйти""");
            answer = console.nextInt();
            switch (answer) {
                case 1 -> {
                    System.out.println("Введите данные книги в формате: Автор Название Год публикации");
                    String title = console.next();
                    String author = console.next();
                    String yearPublication = console.next();
                    bookshelf.addBook(title, author, yearPublication);
                }
                case 2 -> {
                    System.out.println("Введите номер полки удаляемой книги");
                    bookshelf.deleteBook(console.nextInt());
                }
                case 3 -> {
                    System.out.println("Введите название книги");
                    Book newBook = bookshelf.search(console.next());
                    if (newBook == null) {
                        System.out.println("Книга не найдена!");
                    } else {
                        System.out.println(newBook);
                    }
                }
                case 4 -> System.out.println("Выход из полки");
                default -> System.out.println("Действие не найдено!");
            }
        } while (answer != 4);
    }

    public static void display() {
        System.out.println(Arrays.toString(bookshelf.getBooks()));
        System.out.println("Количество книг = " + bookshelf.getCountBooks() + "; Количество свободных полок = "
                + (10 - bookshelf.getCountBooks()));
    }
}
