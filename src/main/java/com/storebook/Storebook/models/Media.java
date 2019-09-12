package com.storebook.Storebook.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "media")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Media implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "path")
    private String path;

    @Column(name = "size")
    private int size;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "media", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Author> authors;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }


    public Media(String asd, int i) {
        this.path = asd;
        this.size = i;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getId() {
        return id;
    }

    public Media(){}

    @Override
    public String toString() {
        return String.format("{\"id\":\"%s\", \"path\":\"%s\", \"size\":\"%s\"}", id, path, size);
    }
}
