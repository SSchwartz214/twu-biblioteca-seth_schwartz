package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private int published;
    private boolean checkedIn;

    public Book(String title, String author, int published, boolean checkedIn) {
        this.title = title;
        this.author = author;
        this.published = published;
        this.checkedIn = checkedIn;
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

        public void setCheckedIn(boolean status) {
            this.checkedIn = status;
        }

        public boolean isCheckedIn () {
            return this.checkedIn;
    }
}