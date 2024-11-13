package com.library.utils;

import com.library.auth.Login;
import com.library.display.CustomDisplay;
import com.library.users.User;

import java.util.Scanner;

public class Utils {
    public Boolean isBookTitleCorrect(String bookTitle) {
        if (bookTitle.isEmpty()) {
            return false;
        }
        return true;
    }
    public Boolean validateInputUsername(String username) {

        return false;
    }

    public int getOptionFromUser(CustomDisplay customDisplay, Scanner scanner, int lowerLimit, int upperLimit) {
        int option = -1;
        while (option < 0) {
            try {
                option = Integer.parseInt(scanner.nextLine().trim());
                if (option < lowerLimit || option > upperLimit) {
                    System.out.println("Please write down a correct option:");
                    option = -1;
                }
            } catch (NumberFormatException error){
                customDisplay.printLine("Please write down a correct option!");
                option = -1;
            }
        }
        return option;
    }
    public User handleLogin(CustomDisplay customDisplay, Scanner scanner) {
        customDisplay.printDefaultHeader();
        customDisplay.printLine("Write down your name: ");
        String username = scanner.nextLine();
        try {
            Login login = new Login();
            User user = login.login(username);
            return user;
        } catch(Exception e) {
            return null;
        }

    }

}
