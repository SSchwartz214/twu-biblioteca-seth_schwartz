package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.Matchers.*;

public class BookListTest {

    @Test
    public void shouldReturnListOfBooks() {
        BookList bookList = new BookList();

        assertThat((bookList.getBookList()), hasSize(3));

        String str1 = bookList.getBookList().get(0).toString();
        assertThat(str1, hasToString(str1));

        String str2 = bookList.getBookList().get(1).toString();
        assertThat(str2, hasToString(str2));

        String str3 = bookList.getBookList().get(2).toString();
        assertThat(str3, hasToString(str3));

        assertThat(bookList.getBookList().get(0).getTitle(), is("Animal Farm"));
        assertThat(bookList.getBookList().get(1).getAuthor(), is("Louis Lowry"));
        assertThat(bookList.getBookList().get(2).getPublished(), is(2011));
    }

    @Test
    public void shouldReturnStringOfBookTitles() {
        BookList bookList = new BookList();
        StringBuilder sb = new StringBuilder("Animal Farm | George Orwell | 1945\nThe Giver | Louis Lowry | 1993\nFifty Shades of Grey | E. L. James | 2011");

        assertThat(bookList.printBookList(bookList.getBookList()).toString(), is("Animal Farm | George Orwell | 1945\nThe Giver | Louis Lowry | 1993\nFifty Shades of Grey | E. L. James | 2011\n"));
    }
}
