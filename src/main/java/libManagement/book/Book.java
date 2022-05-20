package libManagement.book;

import libManagement.actors.Author;

import java.util.List;

public class Book {
    private String ISBN;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;
    private List<Author> authors;
    private BookCategory bookCategory;
}
