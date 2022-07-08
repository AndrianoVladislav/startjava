package com.startjava.graduation.bookshelf;

public class Book {

    private final String title;
    private final String author;
    private final String yearPublication;
    private int shelfNumber;

    public Book (String title, String author, String yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublication() {
        return yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String toString() {
        return  shelfNumber + " " +
                title + " " +
                author + " " +
                yearPublication + "\n";
    }
}
