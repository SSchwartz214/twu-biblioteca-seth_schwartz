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
        ArrayList<String> books = new ArrayList<String>();
        books.add("The Giver");
        books.add("50 Shades of Gray");
        books.add("Cat in the Hat");

        assertThat(bookList.getBookList(), is(books));
        assertThat(books, hasSize(3));
    }
}
