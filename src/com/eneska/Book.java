package com.eneska;

/**
 * Created by eneska on 29.12.2017.
 */
public class Book {

    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    long isbn;

    //konstruktor za jego pomocą tworzę obiekt
    Book(String bookTitle, String bookAuthor, int bookRelease, int bookPages, String bookPublisher,
         long bookIsbn){
        title = bookTitle;
        author =bookAuthor;
        releaseDate =bookRelease;
        pages =bookPages;
        publisher = bookPublisher;
        isbn =bookIsbn;
    }

    //metoda

    void printInfo(){
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);

    }

}