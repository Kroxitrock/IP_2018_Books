package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book implements Serializable{
    private int id;
    private java.sql.Date releaseDate;
    private String genre;
    private String coverPath;

    private Author author;

    public Book() {
    }

    public Book(int id, java.sql.Date releaseDate, String genre, String coverPath, Author author) {
        this.id = id;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.coverPath = coverPath;
        this.author = author;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "release_date")
    public java.sql.Date getReleaseDate() {
        return releaseDate;
    }
    @Column(name = "genre")
    public String getGenre() {
        return genre;
    }
    @Column(name = "cover_path")
    public String getCoverPath() {
        return coverPath;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    public Author getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReleaseDate(java.sql.Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}