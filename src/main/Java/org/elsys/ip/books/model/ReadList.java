package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "read_list")
public class ReadList implements Serializable{
    private int id;
    private int status;

    private Set<User> user;
    private Set<Book> book;

    public ReadList() {
    }

    public ReadList(int id, int status) {
        this.id = id;
        this.status = status;
    }

    public ReadList(int id, int status, Set<User> user, Set<Book> book) {
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

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
    public Set<User> getUser() {
        return user;
    }
    @OneToMany(fetch = FetchType.LAZY, targetEntity = Book.class)
    public Set<Book> getBook() {
        return book;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
