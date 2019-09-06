package models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "media")
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private int id;

    @Column(name = "path")
    private String path;

    @Column(name = "size")
    private BigInteger size;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BigInteger getSize() {
        return size;
    }

    public void setSize(BigInteger size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public Media(){}
    public Media(String path, BigInteger size) {
        this.path = path;
        this.size = size;
    }

    @Override
    public String toString() {
        return path;
    }
}
