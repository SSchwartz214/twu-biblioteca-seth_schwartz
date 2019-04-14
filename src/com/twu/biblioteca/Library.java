package com.twu.biblioteca;
import java.util.ArrayList;


public class Library {
    private ArrayList<Book> list = new ArrayList<Book>();

    public Library() {
        list.add( new Book("Animal Farm", "George Orwell", 1945) );
        list.add( new Book("The Giver", "Louis Lowry", 1993) );
        list.add( new Book("Fifty Shades of Grey", "E. L. James", 2011) );
    }

    public StringBuilder printBookList() {
        StringBuilder sb = new StringBuilder();
        for (Book book : list) {
            sb.append(book.getTitle());
            sb.append(" ");
            sb.append("|");
            sb.append(" ");
            sb.append(book.getAuthor());
            sb.append(" ");
            sb.append("|");
            sb.append(" ");
            sb.append(book.getPublished());
            sb.append("\n");
        }
        return sb;
    }

    public ArrayList<Book> getBooks(){
        return this.list;
    }
}
