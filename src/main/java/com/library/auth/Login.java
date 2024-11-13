package com.library.auth;

import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.books.Book;
import com.library.display.CustomDisplay;
import com.library.users.User;
import com.library.users.UserWrapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

public class Login {
    public static final String USERS_DB_NAME = "database/users.json";
    private List<User> users;

    public Login() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(USERS_DB_NAME);
            UserWrapper userWrapper = objectMapper.readValue(inputStream, UserWrapper.class);
            this.users = userWrapper.getUsers();
        } catch (IOException error){
            error.printStackTrace();
        }
    }
    public User login(String name) {
        Optional<User> user = users.stream()
                .filter(u -> u.getUserName().equals(name))
                .findFirst();
        return user.orElse(null);
    }
    private void updateUsers() {
        // update the users in users.json
    }
    public boolean addBook(String name, Book book) {
        User user = login(name);
        if (user != null) {
            user.getBookList().add(book);
            //updateUsers();
            return true;
        }
        return false;
    }


}
