package com.library.users;

import java.util.List;

public class UserWrapper {
    private List<User> users;
    public UserWrapper() {

    }
    public UserWrapper(List<User> users) {
        this.users = users;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
