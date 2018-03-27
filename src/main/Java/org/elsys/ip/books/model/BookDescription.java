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

    private Set<Book> book = new HashSet<Book>();
    private Set<Language> language = new HashSet<Language>();

    public BookDescription() {
    }

    public BookDescription(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public BookDescription(int id, String name, String description, Set<Book> book, Set<Language> language) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.book = book;
        this.language = language;
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

    @ManyToOne(targetEntity = Book.class)
    public Set<Book> getBook() {
        return book;
    }

    @ManyToOne(targetEntity = Language.class)
    public Set<Language> getLanguage() {
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

    public void setBook(Set<Book> book) {
        this.book = book;
    }

    public void setLanguage(Set<Language> language) {
        this.language = language;
    }
}
