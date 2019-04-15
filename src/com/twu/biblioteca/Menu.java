package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final String[] options = {"(1) View books",
                                      "(2) Check out a book",
                                      "(3) Return a book",
                                      "(4) Quit"
                                     };
    private Library library = new Library();

    public void printMenuOptions() {
        System.out.println("Please select one of the following options:\n");
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println();
    }

    public String getOption() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter option");

        String userOption = reader.nextLine();
        if (!validateOption(userOption)) {
            System.out.println("Please select a valid option!");
        }
        return userOption;
    }

    public void selectOption(String input) {
        while (!input.equals("4")) {
            if (input.equals("1")) {
                System.out.println(library.printBookList());
            } else if (input.equals("2")) {
                System.out.println(library.printBookList());
                System.out.println("Please enter the title of the book you would like to check out");
                Scanner reader = new Scanner(System.in);
                String bookTitle = reader.nextLine();
                System.out.println(library.checkOut(bookTitle));
            } else if (input.equals("3")) {
                System.out.println("Please enter the title of the book you would like to return");
                Scanner reader = new Scanner(System.in);
                String bookTitle = reader.nextLine();
                System.out.println(library.returnBook(bookTitle));
            }
            printMenuOptions();
            input = getOption();
        }
    }

    public void run() {
        System.out.println("Welcome to Biblioteca.  Your one-stop-shop for great book titles in Bangalore!\n");
        printMenuOptions();
        String selectedOption = getOption();
        selectOption(selectedOption);
    }

    public boolean validateOption(String userOption) {
        ArrayList<String> validOptions = new ArrayList<String>();
                validOptions.add("1");
                validOptions.add("2");
                validOptions.add("3");
                validOptions.add("4");
        if (validOptions.contains(userOption)) {
            return true;
        }
        return false;
    }
}