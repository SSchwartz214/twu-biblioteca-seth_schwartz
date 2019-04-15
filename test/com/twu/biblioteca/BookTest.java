package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BookTest {

    @Test
    public void shouldReturnTitle() {
        Book book = new Book("Animal Farm", "George Orwell", 1945, true);

        assertThat(book.getTitle(), is("Animal Farm"));
    }

    @Test
    public void shouldReturnAuthor() {
        Book book = new Book("Animal Farm", "George Orwell", 1945, true);

        assertThat(book.getAuthor(), is("George Orwell"));
    }

    @Test
    public void shouldReturnPublishedDate() {
        Book book = new Book("Animal Farm", "George Orwell", 1945, true);

        assertThat(book.getPublished(), is(1945));
    }

    @Test
    public void shouldReturnCheckedInStatus() {
        Book book = new Book("Animal Farm", "George Orwell", 1945, true);

        assertThat(book.isCheckedIn(), is(true));
    }
}
