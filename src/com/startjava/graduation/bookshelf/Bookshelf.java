package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int countBooks;
    private final Book[] books = new Book[10];

    public Bookshelf() {
        books[0] = new Book ("Три мушкетера", "Александр Дюма", "1844");
        books[1] = new Book ("Мастер и Маргарита", "Михаил Булгаков", "1940");
        books[2] = new Book ("Евгений Онегин", "Александр Пушкин", "1930");
        books[3] = new Book ("Ромео", "Уильям Шекспир", "1595");
        countBooks = 4;
        books[4] = new Book ("", "", "");
        Arrays.fill(books,5 ,books.length, books[4]);
    }

    public void launch() {
        for (int i = 0; i < countBooks; i++) {
            books[i].setShelfNumber(i + 1);
        }
        System.out.println("Количество книг = " + countBooks + "; Количество свободных полок = " + (10 - countBooks));
    }

    public boolean addBook(String title, String author, String yearPublication) {
        if (countBooks == books.length) {
            return true;
        } else {
            books[countBooks] = new Book(title, author, yearPublication);
            countBooks++;
        }
        return false;
    }

    public void deleteBook(int number) {
        if (number < 1 || number > countBooks) {
            System.out.println("Книга не найдена!\n");
        } else {
            System.arraycopy(books, number, books, number - 1, countBooks - number);
            countBooks--;
            books[countBooks] = new Book ("", "", "");
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

    public Book getBooks(int i) {
        return books[i];
    }

    public int getCountBooks() {
        return countBooks;
    }
}
