package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "comments")
public class Comments implements Serializable{
    int id;
    String body;
    Double rating;

    User user;
    Book book;

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
    @ManyToOne(fetch = FetchType.LAZY)
    public User getUser() {
        return user;
    }
    @OneToMany(fetch = FetchType.LAZY)
    public Book getBook() {
        return book;
    }
}
