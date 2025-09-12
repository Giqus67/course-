package dev.ddanylenko.module5.task7;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        if(book1.getAuthor().compareTo(book2.getAuthor()) > 0){
            return 1;
        } else if (book1.getAuthor().compareTo(book2.getAuthor()) < 0) {
            return -1;
        }
        else{
            return book1.getTitle().compareTo(book2.getTitle());
        }
    }
}
