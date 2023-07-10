package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        bookstore.run();
    }

    public void run() {
        while (true) {
            System.out.println("--- Bookstore Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Edit Book");
            System.out.println("3. Search Book");
            System.out.println("4. Print All Books");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    printAllBooks();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    private void addBook() {
        System.out.println("--- Add Book ---");
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        Book book = new Book(title, author, year, price);
        books.add(book);

        System.out.println("Book Added Successfully!");
    }

    private void editBook() {
        System.out.println("--- Edit Book ---");
        System.out.print("Enter Title of Book to Edit: ");
        String title = scanner.nextLine();

        Book book = findBook(title);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        System.out.println("Current Book Info:");
        System.out.println(book);

        System.out.print("Enter new Title (press enter to keep current): ");
        String newTitle = scanner.nextLine();
        if (!newTitle.isEmpty()) {
            book.setTitle(newTitle);
        }

        System.out.print("Enter new Author (press enter to keep current): ");
        String newAuthor = scanner.nextLine();
        if (!newAuthor.isEmpty()) {
            book.setAuthor(newAuthor);
        }

        System.out.print("Enter new Year (press 0 to keep current): ");
        int newYear = scanner.nextInt();
        scanner.nextLine();
        if (newYear != 0) {
            book.setYear(newYear);
        }

        System.out.print("Enter new Price (press 0 to keep current): ");
        double newPrice = scanner.nextDouble();
        scanner.nextLine();
        if (newPrice != 0) {
            book.setPrice(newPrice);
        }

        System.out.println("Book Edited Successfully!");
    }

    private void searchBook() {
        System.out.println("--- Search Book ---");
        System.out.print("Enter Title of Book to Search: ");
        String title = scanner.nextLine();

        Book book = findBook(title);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        System.out.println("Book Info:");
        System.out.println(book);
    }

    private void printAllBooks() {
        if (books.size() == 0) {
            System.out.println("No Books Found!");
            return;
        }

        System.out.println("--- All Books ---");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("-------------------");
        }
    }

    private void deleteBook() {
        System.out.println("--- Delete Book ---");
        System.out.print("Enter Title of Book to Delete: ");
        String title = scanner.nextLine();

        Book book = findBook(title);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        books.remove(book);

        System.out.println("Book Deleted Successfully!");
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }
}
