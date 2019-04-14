package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        //TODO refactor into Menu class
        WelcomeMessage welcomeMessage = new WelcomeMessage();
        Menu menu = new Menu();

        System.out.println(welcomeMessage.printWelcomeMessage());
        menu.run();
//        System.out.println(bookList.printLibrary(bookList.getLibrary()));
    }
}
