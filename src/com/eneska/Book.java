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
    Book(String title, String author, int releaseDate, int pages, String publisher, long isbn){

        this.title = title;
        this.author =author;
        this.releaseDate =releaseDate;
        this.pages =pages;
        this.publisher = publisher;
        this.isbn =isbn;
    }

    //tworzę nowy konstruktor typ
    Book(Book kniga) {
        this(kniga.title, kniga.author, kniga.releaseDate, kniga.pages, kniga.publisher, kniga.isbn);
    }

    //metoda

    void printInfo(){
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);

    }

}