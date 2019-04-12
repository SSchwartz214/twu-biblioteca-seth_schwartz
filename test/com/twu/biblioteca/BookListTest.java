package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

public class BookListTest {

    @Test
    public void shouldReturnListOfBooks() {
        BookList bookList = new BookList();
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add( new Book("Animal Farm", "George Orwell", 1945) );
        bookList.add( new Book("The Giver", "Louis Lowryl", 1993) );
        bookList.add( new Book("Fifty Shades of Grey", "E. L. James", 2011) );

        assertThat(bookList.getBookList(), is(books));
        assertThat(books, hasSize(3));
    }
}
