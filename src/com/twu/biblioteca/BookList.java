package com.twu.biblioteca;
import java.util.ArrayList;


public class BookList {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public ArrayList<Book> getBookList() {
        bookList.add( new Book("Animal Farm", "George Orwell", 1945) );
        bookList.add( new Book("The Giver", "Louis Lowryl", 1993) );
        bookList.add( new Book("Fifty Shades of Grey", "E. L. James", 2011) );

        return bookList;
    }
}
