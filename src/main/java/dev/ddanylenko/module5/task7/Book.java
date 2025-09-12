package dev.ddanylenko.module5.task7;

public class Book  implements Comparable<Book> {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book book) {
        if(this.author.compareTo(book.getAuthor()) > 0){
            return 1;
        }
        else if(this.author.compareTo(book.getAuthor()) < 0){
            return -1;
        }
        else{
            return this.title.compareTo(book.getTitle());
        }
    }

    @Override
    public String toString() {
        return this.author + " : " + this.title;
    }
}
