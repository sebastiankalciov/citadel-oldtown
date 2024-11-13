package com.library.users;

import com.library.books.Book;

import java.util.List;

public class User {

    private int userID;
    private String userName;
    private List<Book> bookList;
    public User(int userID, String userName, List<Book> bookList) {
        this.userID = userID;
        this.userName = userName;
        this.bookList = bookList;
    }

    public int getUserID() {return userID;}
    public String getUserName() {return userName;}
    public List<Book> getBookList() {return bookList;}

    public void setUserName(String userName) {this.userName = userName;}
    public void setUserID(int userID) {this.userID = userID;}
    public void setBookList(List<Book> bookList) {this.bookList = bookList;}
    public void addBook(Book book) {
        bookList.add(book);
    }
}
