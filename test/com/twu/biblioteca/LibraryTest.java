package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.Matchers.*;

public class LibraryTest {

    @Test
    public void shouldReturnListOfBooks() {
        Library library = new Library();

        assertThat((library.getBooks()), hasSize(3));

        String str1 = library.getBooks().get(0).toString();
        assertThat(str1, hasToString(str1));

        String str2 = library.getBooks().get(1).toString();
        assertThat(str2, hasToString(str2));

        String str3 = library.getBooks().get(2).toString();
        assertThat(str3, hasToString(str3));

        assertThat(library.getBooks().get(0).getTitle(), is("Animal Farm"));
        assertThat(library.getBooks().get(1).getAuthor(), is("Louis Lowry"));
        assertThat(library.getBooks().get(2).getPublished(), is(2011));
    }

    @Test
    public void shouldReturnStringOfBookTitles() {
        Library library = new Library();
        StringBuilder sb = new StringBuilder("Animal Farm | George Orwell | 1945\nThe Giver | Louis Lowry | 1993\nFifty Shades of Grey | E. L. James | 2011");

        assertThat(library.printBookList().toString(), is("Animal Farm | George Orwell | 1945\nThe Giver | Louis Lowry | 1993\nFifty Shades of Grey | E. L. James | 2011\n"));
    }

    @Test
    public void shouldCheckoutABook() {
        Library library = new Library();

        library.checkOut("Animal Farm");

        assertThat(library.getBooks().get(0).isCheckedIn(), is(false));
    }

    @Test
    public void checkOutBookShouldReturnSuccessMessage() {
        Library library = new Library();

        assertThat(library.checkOut("Animal Farm"), is("Thank you! Enjoy the book!"));
    }

    @Test
    public void checkOutBookShouldReturnUnsuccessfulMessage() {
        Library library = new Library();

        library.checkOut("Animal Farm");

        assertThat(library.checkOut("Animal Farm"), is("Sorry, that book is not available"));

        assertThat(library.checkOut("The Gaver"), is("Sorry, that book is not available"));
    }
}
