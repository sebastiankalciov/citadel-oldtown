package com.library;

import com.library.auth.Login;
import com.library.books.Book;
import com.library.display.CustomDisplay;
import com.library.users.User;
import com.library.utils.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomDisplay display = new CustomDisplay();
        display.printHeader();

        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        int option = utils.getOptionFromUser(display, scanner, 1, 3);
        Login loginSystem = new Login();

        User currentUser = new User();

        switch (option) {

            case 1:
                display.clearScreen();
                currentUser = utils.handleLogin(display, scanner);
                if (currentUser == null) {
                    display.printLine("You name does not ring any bell for us!");
                    return;
                }
                break;

            case 2:
                display.clearScreen();
                display.printSpace(1);
                // implement createUserAccount
                display.printLine("I am sorry m'lord, we do not have this kind of technology right now..");
                display.printSpace(1);
                return;

            case 3:
                display.clearScreen();
                display.printExitBanner();
                return;

        }

        display.clearScreen();
        display.printMenu(currentUser.getUserName());
        option = utils.getOptionFromUser(display, scanner, 1, 3);

        do {
            switch (option) {
                case 1:
                    display.clearScreen();
                    currentUser.printAllBooks(display);
                    return;

                case 2:
                    display.printLine("Please write down the name of the book: ");
                    String bookTitle = scanner.nextLine();
                    if (!utils.isBookTitleCorrect(bookTitle)) {
                        display.clearScreen();
                        display.printLine("You tried to fool us with an empty book!");
                        return;
                    }
                    display.printLine("Please write down the name of the author: ");
                    String bookAuthor = scanner.nextLine();

                    Book newBook = new Book(bookTitle, bookAuthor, "", 0, "");
                    boolean isBookAdded = loginSystem.addBook(currentUser.getUserName(), newBook);
                    display.clearScreen();

                    if (isBookAdded) {
                        display.printLine("Book added succesfully into your knowledge vault!");
                    } else {
                        display.printLine("Maesters were not able to add your book in your knowledge vault!");
                    }
                    return;


                case 3:
                    display.clearScreen();
                    display.printExitBanner();
                    return;

            }
        } while(option != 3);

    }
}