package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Шилдт", 800);
        Book bookTwo = new Book("Хортстман", 500);
        Book bookThree = new Book("Эванс", 300);
        Book bookFour = new Book("Clean Code", 250);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getNameOfBook() + " имеет примерно " + book.getNumberOfPages() + " страниц");
        }
        System.out.println("перестановка по заданию ");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getNameOfBook() + " имеет примерно " + book.getNumberOfPages() + " страниц");
        }
        System.out.println("Shown only \"Clean Code\": ");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean Code".equals(book.getNameOfBook())) {
                System.out.println(book.getNameOfBook() + " имеет примерно " + book.getNumberOfPages() + " страниц");
            }
        }
    }
}