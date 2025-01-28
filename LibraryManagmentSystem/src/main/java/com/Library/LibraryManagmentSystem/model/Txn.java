package com.Library.LibraryManagmentSystem.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Txn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private Date issueDate;
    private Date ExceptedreturnDate;
    private Date actualReturnDate;

    // relation of transaction with user is
    // one user can be associated with many transactions
    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Book book;


}
