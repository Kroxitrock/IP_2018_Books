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
    private Date releaseDate;
    private String genre;
    private String coverPath;

    private Set<Language> prefferedLanguage = new HashSet<Language>();
    private Set<Author> author = new HashSet<Author>();

    public Book() {
    }

    public Book(int id, Date releaseDate, String genre, String coverPath) {
        this.id = id;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.coverPath = coverPath;
    }

    public Book(int id, Date releaseDate, String genre, String coverPath, Set<Language> prefferedLanguage, Set<Author> author) {
        this.id = id;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.coverPath = coverPath;
        this.prefferedLanguage = prefferedLanguage;
        this.author = author;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "release_date")
    public Date getReleaseDate() {
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
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Language.class)
    public Set<Language> getPrefferedLanguage() {
        return prefferedLanguage;
    }
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Author.class)
    public Set<Author> getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public void setPrefferedLanguage(Set<Language> prefferedLanguage) {
        this.prefferedLanguage = prefferedLanguage;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }
}