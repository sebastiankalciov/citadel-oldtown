package com.library.books;

public class Book {
    private String title;
    private String author;
    private String status;
    private Integer rating;
    private String notes;

    public Book() {}
    public Book(String title, String author, String status, Integer rating, String notes) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.rating = rating;
        this.notes = notes;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getStatus() {return status;}
    public Integer getRating() {return rating;}
    public String getNotes() {return notes;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setStatus(String status) {this.status = status;}
    public void setRating(Integer rating) {this.rating = rating;}
    public void setNotes(String notes) {this.notes = notes;}

}
