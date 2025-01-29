package com.Library.LibraryManagmentSystem.model;


import com.Library.LibraryManagmentSystem.constant.UserType;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true,nullable = false) // because i want email sab person ka unique hona chahiye
    // aur nauulabke ka mtlb data base ke andar email ki value kabbhi bhi null nahi so kati
    private String email;
    private String phoneNumber;

    // two values admin and user so we use enum
    @Enumerated(EnumType.STRING) // ishse database main enum ka value show ho jayega
    private UserType userType;

    @OneToMany(mappedBy = "user")
    private List<Book> books;

    @OneToMany(mappedBy = "user")
    private List<Txn> txns;
    private String name;

    public User(Integer id, String email, String phoneNumber, UserType userType, List<Book> books, List<Txn> txns) {
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
        this.books = books;
        this.txns = txns;
    }
    public User(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public User(String email, String phoneNumber, String name) {
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.name=name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Txn> getTxns() {
        return txns;
    }

    public void setTxns(List<Txn> txns) {
        this.txns = txns;
    }
}
