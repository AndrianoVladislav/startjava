package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public Bookshelf () {
        books[0] = new Book ("Три мушкетера", "Александр Дюма", "1844");
        books[1] = new Book ("Мастер и Маргарита", "Михаил Булгаков", "1940");
        books[2] = new Book ("Евгений Онегин", "Александр Пушкин", "1930");
        books[3] = new Book ("Ромео", "Уильям Шекспир", "1595");
        countBooks = 4;
        books[4] = new Book ("", "", "");
        Arrays.fill(books,5 ,books.length, books[4]);
    }

    private int countBooks;
    private final Book[] books = new Book[10];

    public void launch() {
        for (int i = 0; i < countBooks; i++) {
            books[i].setShelfNumber(i + 1);
        }
        System.out.println(Arrays.toString(books));
        System.out.println("Количество книг = " + countBooks + "; Количество свободных полок = " + (10 - countBooks));
    }

    public void addBook(String title, String author, String yearPublication) {
        if (countBooks == books.length) {
            System.out.println("На полке закончилось место!\n");
        } else {
            countBooks++;
            books[countBooks - 1] = new Book(title, author, yearPublication);
        }
    }

    public void deleteBook(int number) {
        if (number < 1 || number > countBooks) {
            System.out.println("Книга не найдена!\n");
        } else {
            books[number - 1] = new Book ("", "", "");
            countBooks--;
        }
        System.arraycopy(books, number, books, number - 1, countBooks + 1);
    }

    public Book search(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)){
                return books[i];
            }
        }
        return null;
    }
}
