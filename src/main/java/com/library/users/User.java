package com.library.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.library.books.Book;

import java.util.List;

public class User {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;
    private List<Book> bookList;
    public User() {}

    public User(int id, String name, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.bookList = bookList;
    }

    public int getUserID() {return id;}
    public String getUserName() {return name;}
    public List<Book> getBookList() {return bookList;}

    public void setUserName(String name) {this.name = name;}
    public void setUserID(int id) {this.id = id;}
    public void setBookList(List<Book> bookList) {this.bookList = bookList;}
    public void addBook(Book book) {
        bookList.add(book);
    }
}
