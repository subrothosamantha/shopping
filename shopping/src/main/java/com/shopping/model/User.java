package com.shopping.model;

import com.shopping.model.enums.CountryType;
import com.shopping.model.enums.UserType;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Id;
    @Column(nullable = false)
    public String firstName;
    public String lastName;
    @Column(nullable = false)
    public String emailId;
    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public UserType userType;
    @Column(nullable = false)
    public String password;
    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public CountryType countryType;
    @Column(nullable = false)
    public String phone;

    @OneToOne
    public Cart cart;


    public User() { }

    public User(long id, String firstName, String lastName, String emailId, UserType userType, String password, CountryType countryType, String phone) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.userType = userType;
        this.password = password;
        this.countryType = countryType;
        this.phone = phone;
    }

    public User(String firstName, String lastName, String emailId, UserType userType, String password, CountryType countryType, String phone, Cart cart) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.userType = userType;
        this.password = password;
        this.countryType = countryType;
        this.phone = phone;
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public CountryType getCountryType() {
        return countryType;
    }

    public void setCountryType(CountryType countryType) {
        this.countryType = countryType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", userType=" + userType +
                ", password='" + password + '\'' +
                ", countryType=" + countryType +
                ", phone='" + phone + '\'' +
                ", cart=" + cart +
                '}';
    }
}
