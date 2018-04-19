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

    private User user;
    private Book book;

    public Comments() {
    }

    public Comments(int id, String body, Double rating) {
        this.id = id;
        this.body = body;
        this.rating = rating;
    }

    public Comments(int id, String body, Double rating, User user, Book book) {
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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    public Book getBook() {
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

    public void setUser(User user) {
        this.user = user;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
