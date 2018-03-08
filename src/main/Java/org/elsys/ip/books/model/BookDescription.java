package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book_description")
public class BookDescription implements Serializable{
    int id;
    String name;
    String description;

    Book book;
    Language language;

    public BookDescription() {
    }

    public BookDescription(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public BookDescription(int id, String name, String description, Book book, Language language) {
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

    @OneToMany(fetch = FetchType.LAZY)
    public Book getBook() {
        return book;
    }

    @OneToMany(fetch = FetchType.LAZY)
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
}
