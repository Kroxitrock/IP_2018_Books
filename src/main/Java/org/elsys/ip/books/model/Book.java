package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book implements Serializable{
    int id;
    Date releaseDate;
    String genre;
    String coverPath;

    Language prefferedLanguage;

    public Book() {
    }

    public Book(int id, Date releaseDate, String genre, String coverPath) {
        this.id = id;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.coverPath = coverPath;
    }

    public Book(int id, Date releaseDate, String genre, String coverPath, Language prefferedLanguage) {
        this.id = id;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.coverPath = coverPath;
        this.prefferedLanguage = prefferedLanguage;
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
    @ManyToOne(fetch = FetchType.LAZY)
    public Language getPrefferedLanguage() {
        return prefferedLanguage;
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

    public void setPrefferedLanguage(Language prefferedLanguage) {
        this.prefferedLanguage = prefferedLanguage;
    }
}
