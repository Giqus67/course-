package dev.ddanylenko.module5.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comp {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(new Book("Ulysses", "James Joyce"),
                new Book("In Search of Lost Time", "Marcel Proust"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("The Catcher in the Rye", "J. D. Salinger"),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez"),
                new Book("Nineteen Eighty Four", "George Orwell"),
                new Book("Moby-Dick", "Herman Melville"),
                new Book("The Sound and the Fury", "William Faulkner"),
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez")
        ));
        System.out.println("Books before sort: " + books);
        Collections.sort(books);
        System.out.println("Books after sort: " + books);
        Collections.shuffle(books);
        System.out.println("Books after shuffle: " + books);
        books.sort(new BookComparator());
        System.out.println("Books after sort by comparator: " + books);
    }
}
