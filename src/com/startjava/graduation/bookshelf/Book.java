package com.startjava.graduation.bookshelf;

public class Book {



    private final String title;
    private final String author;
    private final int yearPublication;
    private int shelfNumber;

    public Book (String title, String author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getBook() {
        if (title == null) {
            return shelfNumber + " " + " " + " ";
        } else {
            return shelfNumber + " " + title + " " + author + " " + yearPublication;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }
}
