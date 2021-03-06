package com.storebook.Storebook.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
@Table(name = "products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "price")
    private double price;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    @JsonManagedReference
    private Author author;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "media_id")
    @JsonManagedReference
    private Media media;

    public Product() {
    }

    public Product(double price, String title, String description, Category category, Author author, Media media) {
        this.price = price;
        this.title = title;
        this.description = description;
        this.author = author;
        this.media = media;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    //
    public void setAuthor(Author author) {
        this.author = author;
    }

    //
    public Media getMedia() {
        return media;
    }

    //
    public void setMedia(Media media) {
        this.media = media;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return title + " " + price;
    }
}
