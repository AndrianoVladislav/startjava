package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "Cp866");
        Bookshelf bookshelf = new Bookshelf();
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
                        System.out.println(newBook.getTitle() + " " + newBook.getAuthor() + " " + newBook.getYearPublication());
                    }
                }
                case 4 -> System.out.println("Выход из полки");
                default -> System.out.println("Действие не найдено!");
            }
        }
    }
}
