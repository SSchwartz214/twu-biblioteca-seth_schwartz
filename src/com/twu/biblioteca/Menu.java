package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final String[] options = {"(1) List of Books",
                                      "(2) quit"
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
            printMenuOptions();
            getOption();
        }

        return userOption;
    }

    public void selectOption(String input) {
        if (input.equals("1")) {
            System.out.println(library.printBookList());

        } else if (input.equals("2")) {
            System.exit(0);
        }

        printMenuOptions();
        getOption();
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
        if (validOptions.contains(userOption)) {
            return true;
        }
        return false;
    }
}
// Print options
// Get user input(option)
// Take that option and return booklist