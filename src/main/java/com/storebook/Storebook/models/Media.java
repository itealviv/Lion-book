package com.storebook.Storebook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

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
