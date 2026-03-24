package com.example.librarymanagementsystemweb.service;
import java.util.ArrayList;
import java.util.List;
import com.example.librarymanagementsystemweb.model.Book;
public class LibraryService {

    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public String showBooks() {

        if (books.isEmpty()) {
            return "No books available.";
        }

        String result = "";

        for (Book book : books) {
            result += book.getTitle() + " by " + book.getAuthor() + "\n";
        }

        return result;
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setAvailable(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
    }
}
