package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements Serializable{
    int id;
    String name;
    String password;
    String email;

    Language preferredLanguage;

    public User() {
    }

    public User(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(int id, String name, String password, String email, Language preferredLanguage) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.preferredLanguage = preferredLanguage;
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

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "preferred_language")
    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setId(int id) {
        this.id = id;   
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }
}

