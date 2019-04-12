package com.twu.biblioteca;
import java.util.ArrayList;


public class BookList {
    private ArrayList<String> books = new ArrayList<String>();

    public ArrayList<String> getBookList() {
        books.add("The Giver");
        books.add("50 Shades of Gray");
        books.add("Cat in the Hat");

        return books;
    }
}
