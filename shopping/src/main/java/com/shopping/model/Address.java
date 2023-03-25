package com.shopping.model;

import com.shopping.model.enums.AddressType;
import com.shopping.model.enums.CountryType;
import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addressId_generator")
    @SequenceGenerator(name="addressId_generator", initialValue = 58974685,allocationSize = 8,sequenceName = "address_seq")
    public long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    public AddressType addressType;
    @Enumerated(EnumType.STRING)
    @Column(name = "country", nullable = false)
    public CountryType countryType;

    public String city;
    @Column(name = "street")
    public String streetNo;
    @Column(nullable = false)
    public String zipcode;

    public Address() {}
    public Address(long id, AddressType addressType, CountryType countryType, String city, String streetNo, String zipcode) {
        this.id = id;
        this.addressType = addressType;
        this.countryType = countryType;
        this.city = city;
        this.streetNo = streetNo;
        this.zipcode = zipcode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public CountryType getCountryType() {
        return countryType;
    }

    public void setCountryType(CountryType countryType) {
        this.countryType = countryType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressType=" + addressType +
                ", countryType=" + countryType +
                ", city='" + city + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
