package com.twu.biblioteca;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WelcomeMessageTest {

    @Test
    public void shouldReturnWelcomeMessage() {
        WelcomeMessage welcomeMessage = new WelcomeMessage();

        assertThat(welcomeMessage.printWelcomeMessage(), is("Welcome to Biblioteca.  Your one-stop-shop for great book titles in Bangalore!"));
    }
}
