package com.shopping.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
//    public List<Product> cart_items;

    @OneToOne(mappedBy = "cart", cascade = CascadeType.ALL)
    public User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cart() {}

//    public Cart(int id, List<Product> cart_items, User user) {
//        this.id = id;
//        this.cart_items = cart_items;
//        this.user = user;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public List<Product> getCart_items() {
//        return cart_items;
//    }
//
//    public void setCart_items(List<Product> cart_items) {
//        this.cart_items = cart_items;
//    }
//
//    @Override
//    public String toString() {
//        return "Cart{" +
//                "id=" + id +
//                ", cart_items=" + cart_items +
//                ", user=" + user +
//                '}';
//    }
}
