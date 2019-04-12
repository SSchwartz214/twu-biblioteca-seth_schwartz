package com.twu.biblioteca;
import java.util.ArrayList;


public class BookList {
    private ArrayList<Book> list = new ArrayList<Book>();

    public ArrayList<Book> getBookList() {
        list.add( new Book("Animal Farm", "George Orwell", 1945) );
        list.add( new Book("The Giver", "Louis Lowry", 1993) );
        list.add( new Book("Fifty Shades of Grey", "E. L. James", 2011) );

        return list;
    }

    public StringBuilder printBookList(ArrayList<Book> bookList) {
        StringBuilder sb = new StringBuilder();
        for (Book book : bookList) {
            sb.append(book.getTitle());
            sb.append("\n");
        }
        return sb;
    }
}
