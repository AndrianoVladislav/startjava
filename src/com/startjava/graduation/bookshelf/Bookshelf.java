package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int countBooks;
    private final Book[] books = new Book[10];

    public Bookshelf() {
        books[0] = new Book("Три мушкетера", "Александр Дюма", "1844");
        books[0].setShelfNumber(1);
        books[1] = new Book("Мастер и Маргарита", "Михаил Булгаков", "1940");
        books[1].setShelfNumber(2);
        books[2] = new Book("Евгений Онегин", "Александр Пушкин", "1930");
        books[2].setShelfNumber(3);
        books[3] = new Book("Ромео", "Уильям Шекспир", "1595");
        books[3].setShelfNumber(4);
        countBooks = 4;
        books[4] = new Book("", "", "");
        Arrays.fill(books, 5, books.length, books[4]);
    }

    public void addBook(String title, String author, String yearPublication) {
        if (countBooks == books.length) {
            System.out.println("На полке закончилось место!\n");
        } else {
            books[countBooks] = new Book(title, author, yearPublication);
            countBooks++;
        }
    }

    public void deleteBook(int number) {
        if (number < 1 || number > countBooks) {
            System.out.println("Книга не найдена!\n");
        } else {
            System.arraycopy(books, number, books, number - 1, countBooks - number);
            for (int i = number; i < countBooks; i++) {
                books[i - 1].setShelfNumber(i);
            }
            countBooks--;
            books[countBooks] = new Book("", "", "");
        }
    }

    public Book search(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)){
                return books[i];
            }
        }
        return null;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getCountBooks() {
        return countBooks;
    }
}
