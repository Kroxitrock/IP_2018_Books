package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "read_list")
public class ReadList implements Serializable{
    int id;
    int status;

    User user;
    Book book;

    public ReadList() {
    }

    public ReadList(int id, int status) {
        this.id = id;
        this.status = status;
    }

    public ReadList(int id, int status, User user, Book book) {
        this.id = id;
        this.status = status;
        this.user = user;
        this.book = book;
    }
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public User getUser() {
        return user;
    }
    @ManyToMany(fetch = FetchType.LAZY)
    public Book getBook() {
        return book;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
