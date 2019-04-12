package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private short published;

    public Book(String title, String author, short published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

        public String getTitle () {
        return this.title;
    }

        public String getAuthor () {
        return this.author;
    }

        public short published () {
        return this.published;
    }
}