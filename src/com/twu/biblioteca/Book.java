package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private int published;

    public Book(String title, String author, int published) {
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

        public int getPublished () {
        return this.published;
    }
}