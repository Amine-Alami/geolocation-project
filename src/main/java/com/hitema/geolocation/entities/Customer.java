package com.hitema.geolocation.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Boolean active;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", address=" + address +
                '}';
    }

    public Customer id(Long id) {
        this.id = id;
        return this;
    }

    public Customer firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Customer lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Customer email(String email) {
        this.email = email;
        return this;
    }

    public Customer active(Boolean active) {
        this.active = active;
        return this;
    }

    public Customer address(Address address) {
        this.address = address;
        return this;
    }
}
