package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "comments")
public class Comments implements Serializable{
    private int id;
    private String body;
    private Double rating;

    private Set<User> user = new HashSet<User>();
    private Set<Book> book = new HashSet<Book>();

    public Comments() {
    }

    public Comments(int id, String body, Double rating) {
        this.id = id;
        this.body = body;
        this.rating = rating;
    }

    public Comments(int id, String body, Double rating, Set<User> user, Set<Book> book) {
        this.id = id;
        this.body = body;
        this.rating = rating;
        this.user = user;
        this.book = book;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }
    @Column(name = "body")
    public String getBody() {
        return body;
    }
    @Column(name = "rating")
    public Double getRating() {
        return rating;
    }
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    public Set<User> getUser() {
        return user;
    }
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Book.class)
    public Set<Book> getBook() {
        return book;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
