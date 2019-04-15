package com.twu.biblioteca;
import javax.sound.midi.SysexMessage;
import java.util.ArrayList;


public class Library {
    private ArrayList<Book> list = new ArrayList<Book>();

    public Library() {
        list.add( new Book("Animal Farm", "George Orwell", 1945, true));
        list.add( new Book("The Giver", "Louis Lowry", 1993, true));
        list.add( new Book("Fifty Shades of Grey", "E. L. James", 2011, true));
    }

    public StringBuilder printBookList() {
        StringBuilder sb = new StringBuilder();
        for (Book book : list) {
            if (book.isCheckedIn() == true) {
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
        }
        return sb;
    }

    public ArrayList<Book> getBooks(){
        return this.list;
    }

    public String checkOut(String title) {
        for (Book book : list) {
            if (book.getTitle().equals(title) && book.isCheckedIn()) {
                book.setCheckedIn(false);
                return "Thank you! Enjoy the book!";
            }
        }
        return "Sorry, that book is not available";
    }

    public void returnBook(String title) {
        for (Book book : list) {
            if (book.getTitle().equals(title) && !book.isCheckedIn()) {
                book.setCheckedIn(true);
            }
        }
    }
}
