package com.storebook.Storebook.models;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonManagedReference
    private User user;

    @Column(name = "total")
    private String total;

    @Column(name = "date")
    private String date;

    @Column (name = "ip")
    private String ip;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_method_id")
    @JsonManagedReference
    private PaymentMethod paymentMethod;

    @Column (name = "order_user")
    private String orderUser;

    public Order(){}

    public Order(User user, String total, String date, String ip, PaymentMethod paymentMethod, Order order, String orderUser){
        this.user = user;
        this.total = total;
        this.date = date;
        this.ip = ip;
        this.paymentMethod = paymentMethod;
        this.orderUser = orderUser;
    }

    public User getUser(){ return user; }
    public void setUser (User user) { this.user = user; }

    public String getTotal() { return total; }
    public void setTotal (String total) { this.total = total; }

    public String getDate() {return date; }
    public void setDate (String date) { this.date = date; }

    public String getIp() {return ip; }
    public void setIp (String ip) { this.ip = ip; }

    public PaymentMethod getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod (PaymentMethod paymentMethod) { this.paymentMethod = paymentMethod; }

    public String getOrderUser() { return orderUser; }
    public void setOrderUser (String orderUser) { this.orderUser = orderUser; }

    public int getId() { return id; }
}
