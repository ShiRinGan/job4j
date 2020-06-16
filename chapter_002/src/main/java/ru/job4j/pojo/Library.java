package ru.job4j.pojo;

import java.sql.SQLOutput;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book java8 = new Book("Java 8", 900);
        Book grok = new Book("Groking code", 250);
        Book sql = new Book("SQL", 300);

        Book[] books = new Book[4];

        books[0] = cleanCode;
        books[1] = java8;
        books[2] = grok;
        books[3] = sql;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Change books");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (cleanCode.equals(cleanCode)) {
                System.out.println("Take your book");
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
