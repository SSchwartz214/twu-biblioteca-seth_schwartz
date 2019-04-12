package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        WelcomeMessage welcomeMessage = new WelcomeMessage();
        BookList bookList = new BookList();

        System.out.println(welcomeMessage.printWelcomeMessage());
        System.out.println(bookList.printBookList(bookList.getBookList()));
    }
}
