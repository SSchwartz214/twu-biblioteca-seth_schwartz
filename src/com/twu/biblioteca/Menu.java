package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String option1 = "(1) List of Books";
    private Library library = new Library();

    public void printMenuOptions() {
        System.out.println("Please select one of the following options:\n" + option1);
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
        if (input.equals("1")) {
            System.out.println(library.printBookList());
        }
    }

    public void run() {
        //TODO print welcome message
        printMenuOptions();
        String selectedOption = getOption();
        selectOption(selectedOption);
    }

    public boolean validateOption(String userOption) {
        ArrayList<String> validOptions = new ArrayList<String>();
                validOptions.add("1");
        if (validOptions.contains(userOption)) {
            return true;
        }
        return false;
    }
}
// Print options
// Get user input(option)
// Take that option and return booklist