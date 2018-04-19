package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book_description")
public class BookDescription implements Serializable{
    private int id;
    private String name;
    private String description;

    private Book book;
    private Language language;

    private int pages;

    public BookDescription() {
    }


    public BookDescription(int id, String name, String description, Book book, Language language, int pages) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.book = book;
        this.language = language;
        this.pages = pages;
    }
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    @Column(name = "pages")
    public int getPages() {
        return pages;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    public Book getBook() {
        return book;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "language_id")
    public Language getLanguage() {
        return language;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
