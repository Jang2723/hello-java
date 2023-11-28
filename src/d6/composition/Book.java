package d6.composition;

import d6.composition.Author;

import java.time.LocalDateTime;

public class Book {
    private String title;
    private Author author;
    private LocalDateTime released;
    private String[] toc;
    private int price;
}
