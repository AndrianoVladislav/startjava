package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortTitle implements Comparator<Book> {

    public int compare(Book a, Book b)
    {
        if (a == null) {
            return 0;
        } else if (b == null) {
            return -1;
        } else {
            return a.getTitle().compareTo(b.getTitle());
        }
    }
}


public class Bookshelf {

    private int numberBooks;
    private final Book[] books = new Book[10];
    Scanner console = new Scanner(System.in, "Cp866");
    public void launch(String answer) {
        select(answer.charAt(0));
        Arrays.sort(books, new SortTitle());
        for (int i = 0; i < numberBooks; i++) {
            books[i].setShelfNumber(i + 1);
        }
        printBooks();
    }

    public void select(char step) {
        switch (step) {
            case '1' -> addBook();
            case '2' -> deleteBook();
            case '3' -> search();
            default -> System.out.println("Действие не найдено!");
        }
    }

    private void printBooks() {
        for (int i = 0; i < numberBooks; i++) {
            System.out.println(books[i].getBook());
        }
        System.out.println("Количество книг = " + numberBooks + "; Количество свободных полок = " + (10 - numberBooks));
    }
    private void addBook() {
        if (numberBooks == 10) {
            System.out.println("На полке закончилось место!\n");
        } else {
            numberBooks++;
            System.out.println("Введите данные книги в формате: Автор Название Год публикации");
            String title = console.next();
            String author = console.next();
            int yearPublication = console.nextInt();
            books[numberBooks - 1] = new Book(title, author, yearPublication);
        }
    }

    private void deleteBook() {
        System.out.println("Введите номер полки удаляемой книги");
        int number = console.nextInt();
        if (number < 1 || number > numberBooks) {
            System.out.println("Полка не найдена!\n");
        } else {
            books[number - 1] = null;
            numberBooks--;
        }
    }

    private void search() {
        System.out.println("Введите название книги");
        String title = console.next();
        boolean counter = false;
        for (int i = 0; i < numberBooks; i++) {
            if (books[i].getTitle().equals(title)){
                System.out.println(books[i].getBook() + "\n");
                counter = true;
            }
        }
        if (!counter) {
            System.out.println("Книга не найдена!!\n");
        }
    }
}
