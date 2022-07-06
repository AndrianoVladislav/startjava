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

    private int countBooks;
    private final Book[] books = new Book[10];
    Scanner console = new Scanner(System.in, "Cp866");

    public void firstLaunch() {
        books[0] = new Book ("title", "author", 0);
        Arrays.fill(books, books[0]);
    }

    public void launch() {
        Arrays.sort(books, new SortTitle());
        for (int i = 0; i < countBooks; i++) {
            books[i].setShelfNumber(i + 1);
        }
        System.out.println(Arrays.toString(books));
        System.out.println("Количество книг = " + countBooks + "; Количество свободных полок = " + (10 - countBooks));
    }

    public void addBook() {
        if (countBooks == books.length) {
            System.out.println("На полке закончилось место!\n");
        } else {
            countBooks++;
            System.out.println("Введите данные книги в формате: Автор Название Год публикации");
            String title = console.next();
            String author = console.next();
            int yearPublication = console.nextInt();
            books[countBooks - 1] = new Book(title, author, yearPublication);
        }
    }

    public void deleteBook() {
        System.out.println("Введите номер полки удаляемой книги");
        int number = console.nextInt();
        if (number < 1 || number > countBooks) {
            System.out.println("Полка не найдена!\n");
        } else {
            books[number - 1] = new Book ("title", "author", 0);
            countBooks--;
        }
    }

    public void search() {
        System.out.println("Введите название книги");
        String title = console.next();
        boolean counter = false;
        for (int i = 0; i < countBooks; i++) {
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
