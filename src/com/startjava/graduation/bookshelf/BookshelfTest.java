package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    static Scanner console = new Scanner(System.in, "Cp866");
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в вашу книжную полку\n");
        int answer;
        do {
            bookshelf.launch();
            dis();
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
                    if (bookshelf.addBook(title, author, yearPublication)) {
                        System.out.println("На полке закончилось место!\n");
                    }
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

    public static void dis() {
        for (int i = 0; i < bookshelf.getCountBooks(); i++) {
            System.out.println(bookshelf.getBooks(i));
        }
    }
}
