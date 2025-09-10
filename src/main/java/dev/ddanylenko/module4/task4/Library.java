package dev.ddanylenko.module4.task4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> findByTitle(String title) {
        return books.stream().filter(book -> (book.getTitle().equalsIgnoreCase(title))).toList();
    }

    public static void main(String[] args) {
        List<Book> books = List.of(new Book("Ulysses", "James Joyce"),
                new Book("In Search of Lost Time", "Marcel Proust"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("The Catcher in the Rye", "J. D. Salinger"),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez"),
                new Book("Nineteen Eighty Four", "George Orwell"),
                new Book("Moby-Dick", "Herman Melville"),
                new Book("The Sound and the Fury", "William Faulkner"),
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez")
                );
        Library library = new Library(books);
        System.out.println(library.getBooks());
        System.out.println("Find book: " + "One Hundred Years of Solitude - " + library.findByTitle("One Hundred Years of Solitude"));
    }
}
