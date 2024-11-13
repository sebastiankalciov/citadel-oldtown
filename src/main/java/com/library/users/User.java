package com.library.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.library.books.Book;
import com.library.display.CustomDisplay;

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

    public void printAllBooks(CustomDisplay display) {
        List <Book> books = this.getBookList();
        display.printBookshelf();
        if (books == null || books.isEmpty()) {
            display.printLine("Your knowledge vault is all dusty...");
            return;
        }
        display.printLine("Your knowledge vault: ");
        display.printSpace(1);

        for (Book book : books) {

            display.printLine("Title: " + book.getTitle());
            display.printLine("Author: " + book.getAuthor());
            display.printLine("Rating: " + book.getRating());
            display.printLine("Notes: " + book.getNotes());
            display.printSpace(1);
        }
    }

}
