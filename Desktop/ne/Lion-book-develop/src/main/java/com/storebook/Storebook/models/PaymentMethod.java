package com.storebook.Storebook.models;
import javax.persistence.*;


@Entity
@Table(name = "payments_method")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column (name = "api_public_key")
    private String apiPublicKey;

    @Column (name = "api_url")
    private  String apiUrl;

    @Column (name = "api_private_key")
    private String apiPrivateKey;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "media_id")
    private Media media;

    public PaymentMethod() {

    }
    public PaymentMethod(String title, String apiPublicKey, String apiUrl, String apiPrivateKey, Media media){
        this.title = title;
        this.apiPublicKey = apiPublicKey;
        this.apiUrl = apiUrl;
        this.apiPrivateKey = apiPrivateKey;
        this.media = media;
    }

    public String getTitle() { return title; }
    public void setTitle (String title) {this.title = title;}

    public String getApiPublicKey() { return apiPublicKey; }
    public void setApiPublicKey(String apiPublicKey) { this.apiPublicKey = apiPublicKey; }

    public String getApiUrl () {return apiUrl; }
    public void setApiUrl (String apiUrl) { this.apiUrl = apiUrl; }

    public String getApiPrivateKey() { return apiPrivateKey; }
    public void setApiPrivateKey (String apiPrivateKey) { this.apiPrivateKey = apiPrivateKey; }

    public Media getMedia() { return media; }
    public void setMedia (Media media) { this.media = media; }

    public int getId() { return id; }

}
