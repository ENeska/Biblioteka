package com.eneska;

public class Library {

    public static void main(String[] args) {
        final String appName = "Biblioteka v0.1";

        Book book1 = new Book("Siła nawyku", "Duhigg Charles", 2013, 424, "Dom Wydawniczy PWN", 9781400069286l);

        Book book2 = new Book("Mądrzej, szybciej, lepiej", "Duhigg Charles", 2017, 543,"Dom Wydawniczy PWN", 9793400069286l );

        Book book3 = new Book(book1);

        System.out.println(appName);
        System.out.println("Dostępne książki");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

    }
}
