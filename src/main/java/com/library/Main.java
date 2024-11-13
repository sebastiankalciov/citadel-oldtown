package com.library;


import com.library.auth.Login;
import com.library.books.Book;
import com.library.display.CustomDisplay;
import com.library.users.User;

public class Main {
    public static void main(String[] args) {
        CustomDisplay display = new CustomDisplay();
        System.out.println("\n");
        System.out.println("\n");
        display.printHeader();
        System.out.println("Hello, wanderer!");
        System.out.println("\n");
        System.out.println("\n");
        Login loginSystem = new Login();
        User loginTest = loginSystem.login("seb");
        System.out.println(loginTest.getUserName());
    }
}