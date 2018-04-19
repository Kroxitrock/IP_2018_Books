package org.elsys.ip.books.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "language")
public class Language implements Serializable{

    private int id;
    private String name;


    public Language() {
    }

    public Language(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name", unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
